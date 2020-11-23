package com.lunxun.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.lunxun.ServiceIps;


public class WeightRandomDome {
	public static List<String> weiIps = new ArrayList<String>();
	static {
		for(String ip:ServiceIps.weignt_list.keySet()){
			Integer weight = ServiceIps.weignt_list.get(ip);
			for(int i=0;i<weight;i++){
				weiIps.add(ip);
			}
		}
	}
	public static String getServer(){
		Random ran = new Random();
		int r = ran.nextInt(weiIps.size());
		return weiIps.get(r);
	}
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<10000;i++){
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
