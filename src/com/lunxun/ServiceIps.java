package com.lunxun;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ServiceIps {
	public static final List<String> serviceList = Arrays.asList("192.168.0.1",
			"192.168.0.2", "192.168.0.3", "192.168.0.4", "192.168.0.5",
			"192.168.0.6", "192.168.0.7", "192.168.0.8", "192.168.0.9",
			"192.168.0.10");
	public static final Map<String, Integer> weignt_list = new LinkedHashMap<String, Integer>();
	static {
		weignt_list.put("192.168.0.1", 1);
		weignt_list.put("192.168.0.2", 3);
		weignt_list.put("192.168.0.3", 5);
		weignt_list.put("192.168.0.4", 6);
		weignt_list.put("192.168.0.5", 8);
		weignt_list.put("192.168.0.6", 10);
		weignt_list.put("192.168.0.7", 2);
		weignt_list.put("192.168.0.8", 4);
		weignt_list.put("192.168.0.9", 7);
		weignt_list.put("192.168.0.10", 9);
	}
	public static final Map<String, Integer> weignt_list2 = new LinkedHashMap<String, Integer>();
	static {
		weignt_list2.put("A", 2);
		weignt_list2.put("B", 3);
		weignt_list2.put("C", 5);
	}
}
