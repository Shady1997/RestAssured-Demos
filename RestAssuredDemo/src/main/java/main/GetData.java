package main;

import static io.restassured.RestAssured.*;
public class GetData {
	
	public static void main(String[]args) {
		testResponseCode();
	}

	static String api = "https://samples.openweathermap.org/data/2.5/weather?q=London,"
			+ "uk&appid=b6907d289e10d714a6e88b30761fae22";

	
	public static void testResponseCode() {
		int code = get(api).getStatusCode();
		System.out.println("Code : " + code);
	}
	public void testBody() {
		long time = get(api).getTime();
		System.out.println("Response Time : " + time);
	}
}
