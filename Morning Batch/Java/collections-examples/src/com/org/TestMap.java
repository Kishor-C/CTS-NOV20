package com.org;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "root");
		map.put("password", "secretkey");
		
		System.out.println(map);
	}
}
