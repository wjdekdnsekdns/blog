package User.DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "user";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "root";
	
	private Connection conn;
	public DBHelper() {
		// TODO Auto-generated constructor stub
	}
	private static DBHelper dbHelper;
	public static DBHelper getInstance() {
		if(dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}
	public Connection getConnection() {
			if(conn == null) {
				String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
				String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
					System.out.println(" >> DB연결 완료 << ");
				} catch (Exception e) {
					System.out.println(" >> DBHelper 에서 오류가 발생 << ");
					e.printStackTrace();
			}
		}
		return conn;
	}
}
