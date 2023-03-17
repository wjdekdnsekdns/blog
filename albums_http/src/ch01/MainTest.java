package ch01;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainTest {

	public static void main(String[] args) {
		URL url;
		
		try {
			url = new URL("https://jsonplaceholder.typicode.com/albums/1");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			int statusCode = conn.getResponseCode();
			System.out.println(statusCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
