package com.albums;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.albums.AlbumDAO.AlbumDAO;
import com.albums.AlbumDTO.AlbumDTO;
import com.albums.Controller.Controller;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainTest {
	public static void main(String[] args) {
		URL url;
		AlbumDTO dto = null;
		AlbumDAO al = null;
		try {
			url = new URL("https://jsonplaceholder.typicode.com/albums");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int statusCode = conn.getResponseCode();
			System.out.println("statusCode : " + statusCode);
			if (statusCode == 200) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = null;
				StringBuffer sb = new StringBuffer();
				
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
				String str = sb.toString();
				Gson gson = new Gson();
			//	albumDAO = new AlbumDAO();
				Type listType = new TypeToken<List<AlbumDTO>>() {}.getType();
				ArrayList<AlbumDTO> todolist = gson.fromJson(str, listType);

				for (AlbumDTO DTO : todolist) {
				//albumDAO.save(albumDTO);
					System.out.println(DTO);
				}
//				dto = gson.fromJson(str, AlbumDTO.class);
//				System.out.println("userId : " + dto.getUserId());
//				System.out.println("id : " + dto.getId());
//				System.out.println("title : " + dto.getTitle());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 데이터 관리 , 생성

//		dto = new AlbumDTO(dto.getUserId(), dto.getId(), dto.getTitle());
		// Controller controller = new Controller();
//		String result = controller.requestSignUp(dto);
//		System.out.println(result);

		
		
		// delete
	//	albumDAO.delete(1);
		
		// select
//		albumDAO.select(3);
//		System.out.println(dto.toString());
	}
}
