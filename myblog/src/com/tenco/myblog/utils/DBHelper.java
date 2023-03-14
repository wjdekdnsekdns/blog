package com.tenco.myblog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author GGG Connection 객체를 생성하고 반환하는 처리
 * 
 */
public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "myblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "bloguser";
	private static final String DB_PASSWORD = "1q2w3e4r5t";

	private Connection conn;

	// 싱글톤 패턴
	// 1. 기본 생성자를 만들어서 private 설정
	public DBHelper() {
	}

	// 2. 자기 자신을 private 으로 선언
	private static DBHelper dbHelper;

	// 3. 외부 어디서근지 접근 가능한 static 메소드를 만들어 준다
	public static DBHelper getInstance() {
		if (dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}

	public Connection getConnection() {
		if (conn == null) {
			// 한번도 생성하지 않았다면 동작
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">> DB 연결 완료 <<");
			} catch (Exception e) {
				System.out.println(">> DBHelper 에서 오류가 발생 했어! <<");
				e.printStackTrace();
			}
		}
		// todo 추후 삭제 예정
		//System.out.println("DBHelper 안에서 주소 찍어 보기 : " + this);
		return conn;

	}

	public void closeConnection() {
		try {
			conn.close();
			conn = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
