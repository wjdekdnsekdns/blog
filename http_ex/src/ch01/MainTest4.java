package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainTest4 {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("https://jsonplaceholder.typicode.com/todos");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int statusCode = conn.getResponseCode();
			System.out.println("statusCode : " + statusCode);
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			StringBuffer sb = new StringBuffer();
			while( (line = reader.readLine()) != null ) {
				sb.append(line);
			}
			
			String result = sb.toString();
			Gson gson = new Gson();
			// 1. ArrayList<Object> 를 파싱하기 위해서 데이터 타입 선언
			Type listType = new TypeToken<List<Todo>>() {}.getType();		
			ArrayList<Todo> todolist = gson.fromJson(result, listType);
			for (Todo todo : todolist) {
				System.out.println(todo);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
