package com.lunxun.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.lunxun.ServiceIps;


public class WeightRandomDome2 {
	public static int weight = 0;
	static {
		for(String ip:ServiceIps.weignt_list2.keySet()){
			weight +=ServiceIps.weignt_list2.get(ip);
		}
	}
	public static String getServer(){
		Random ran = new Random();
		int ni = ran.nextInt(weight);
		for(String ip:ServiceIps.weignt_list2.keySet()){
			Integer weight = ServiceIps.weignt_list2.get(ip);
			if(ni<weight){
				return ip;
			}
			ni = ni-weight;
		}
		return "";
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
