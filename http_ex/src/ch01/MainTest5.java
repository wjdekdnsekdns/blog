package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import ch01.UserTodo.company;

public class MainTest5 {

	public static void main(String[] args) {
		URL url;
		
		try {
			url = new URL("https://jsonplaceholder.typicode.com/users");
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
				Gson gson = new Gson();
				
				Type listType = new TypeToken<List<UserTodo>>() {}.getType();
				ArrayList<UserTodo> todolist = gson.fromJson(str, listType);
				for (UserTodo userTodo : todolist) {
					System.out.println(userTodo);
				}
				company company;
						
				
				
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
