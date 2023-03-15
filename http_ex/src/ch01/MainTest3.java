package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class MainTest3 {
	public static void main(String[] args) {

		// url
		// ...I/O
		// POST <-- ch01 패키지에서
		// 값을 담았다면 콘솔창에 출력
		
		URL url;
		try {
			url = new URL("https://jsonplaceholder.typicode.com/posts/19");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();	
			conn.setRequestMethod("GET");
			conn.connect();
			int statusCode = conn.getResponseCode();
			System.out.println("statusCode : " + statusCode);
			if(statusCode == 200) {
				BufferedReader reader =  new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = null;
				StringBuffer sb = new StringBuffer();
				while( (line = reader.readLine()) != null ) {
					sb.append(line);
				}
				String str = sb.toString();
				//System.out.println(sb.toString());
				
				Gson gson = new Gson();
				PostTodo todo = gson.fromJson(str, PostTodo.class);
				System.out.println("id : " + todo.getId());
				System.out.println("userId : " + todo.getUserId());
				System.out.println("title : " + todo.getTitle());
				System.out.println("bodt : " + todo.getBody());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
