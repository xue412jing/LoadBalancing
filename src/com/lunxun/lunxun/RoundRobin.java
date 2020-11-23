package com.lunxun.lunxun;

import java.util.HashMap;
import java.util.Map;

import com.lunxun.ServiceIps;

/**
 * 普通轮训
 * @author cec
 *
 */
public class RoundRobin {
	private static Integer pos = 0;
	public static String getServer(){
		String ip = null;
		synchronized (pos) {
			if(pos>=ServiceIps.serviceList.size()){
				pos = 0;
			}
			ip = ServiceIps.serviceList.get(pos);
			pos++;
		}
		return ip;
	}
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	for(int i=0;i<100;i++){
		String ip = getServer();
		if(map.containsKey(ip)){
			map.put(ip, map.get(ip)+1);
		}else{
			map.put(ip,1);
		}
	}
	for(String ip :map.keySet()){
		System.out.println(ip+"\t"+map.get(ip));
	}
}
}
