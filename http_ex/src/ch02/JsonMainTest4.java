package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonMainTest4 {
	public static void main(String[] args) {
		
		// 문제 1
		JsonArray jsonArray = new JsonArray();
		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("name", "홍길동");
		jsonObject1.addProperty("age", 20);
		jsonObject1.addProperty("address", "부산");
		
		JsonObject jsonObject2 = new JsonObject();
		jsonObject2.addProperty("name", "이순신");
		jsonObject2.addProperty("age", 33);
		jsonObject2.addProperty("address", "서울");
		
		JsonObject jsonObject3 = new JsonObject();
		jsonObject3.addProperty("name", "세종대왕");
		jsonObject3.addProperty("age", 59);
		jsonObject3.addProperty("address", "세종시");
		
		jsonArray.add(jsonObject1);
		jsonArray.add(jsonObject2);
		jsonArray.add(jsonObject3);
		
		System.out.println(jsonArray);
		System.out.println("---------------------------");
		
		
		// 문제 2
		
		JsonArray jsonArray2 = new JsonArray();
		JsonObject jsonObject4 = new JsonObject();
		jsonObject4.addProperty("id", 1);
		jsonObject4.addProperty("title", "청소");
		jsonObject4.addProperty("complete", false);
		jsonArray2.add(jsonObject4);
		
		JsonObject jsonObject5 = new JsonObject();
		jsonObject5.addProperty("id", 2);
		jsonObject5.addProperty("title", "영어공부");
		jsonObject5.addProperty("complete", true);
		jsonArray2.add(jsonObject5);
	
		JsonObject jsonObject6 = new JsonObject();
		jsonObject6.add("todolist", jsonArray2);
		jsonObject6.addProperty("server_name", "server_1");
		System.out.println(jsonObject6);
		
		
		
	}
}
