package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonMainTest3 {

	public static void main(String[] args) {
		JsonArray jsonArray = new JsonArray();
		// [] <---
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("naem", "티모");
		
		System.out.println(jsonArray);
		System.out.println("=================");
		System.out.println(jsonObject);
		
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		
		System.out.println("=================");
		System.out.println(jsonArray);
		System.out.println("=================");
		
		JsonArray jsonArray2 = new JsonArray();
		JsonObject jsonObject2 = new JsonObject();
		jsonObject2.addProperty("userId", 1);
		jsonObject2.addProperty("id", 2);
		jsonObject2.addProperty("title", "quis ut nam facilis et officia qui");
		jsonObject2.addProperty("completed", false);
		
		JsonObject jsonObject3 = new JsonObject();
		jsonObject3.addProperty("userId", 1);
		jsonObject3.addProperty("id", 3);
		jsonObject3.addProperty("title", "fugiat veniam minus");
		jsonObject3.addProperty("completed", false);
		
		jsonArray2.add(jsonObject2);
		jsonArray2.add(jsonObject3);
		System.out.println(jsonArray2);
		
		
		// jsonArray 에서 jsonObject 꺼내는 방법
		JsonObject targetObject =  jsonArray.get(0).getAsJsonObject();
		System.out.println(targetObject);
		String strName =  targetObject.get("name").getAsString();
		System.out.println(strName);
		

		
	}

}
