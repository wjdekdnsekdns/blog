package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class MainTest1 {

	public static void main(String[] args) {
		// Clint --> Server ---> dataBase
		// Clint <-- Server <--- dataBase
		// 기본 자바표준 기술인 http 클래스를 이용하여 http통신을 통해서 
		// 데이터를 요청하고 응답 받아 보는 기술을 확인해 보자
		// https://jsonplaceholder.typicode.com/todos
		
		//http 통신
		
		// URL 클래스
		// HttpURLConnection 클래스 필요
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			int statusCode = conn.getResponseCode();
			System.out.println("statusCode : " + statusCode);
			
			BufferedReader reader =  new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			StringBuffer sb = new StringBuffer();
			String line = null;
			// reader.readLine() --> null 만나면 더이상 읽을 데이터가 없음
			while( ( line = reader.readLine() ) != null) {
				sb.append(line + "\n");
			}
			String resultStr = sb.toString();
			System.out.println(resultStr);
			
			// Gson 라이브 가지고 오고 설정 하는 방법
			// gson 대표적인 사용법 및 개념
			Gson gson = new Gson();
			
			Todo todo = new Todo();
			
		
			System.out.println(todo);
//			new InputStreamReader(conn.getInputStream());
//			 conn.getInputStream(); // 한바이트씩 데이터를 읽어 들이는 녀석
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
