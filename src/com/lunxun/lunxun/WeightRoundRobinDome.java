package com.lunxun.lunxun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lunxun.ServiceIps;

/**
 * 加权轮训算法
 * @author cec
 *
 */
public class WeightRoundRobinDome {
	public static List<String> weiIps = new ArrayList<String>();
	private static Integer pos = 0;
	static {
		for(String ip:ServiceIps.weignt_list.keySet()){
			Integer weight = ServiceIps.weignt_list.get(ip);
			for(int i=0;i<weight;i++){
				weiIps.add(ip);
			}
		}
	}
	public static String getServer(){
		String ip = null;
		synchronized (pos) {
			if(pos>=weiIps.size()){
				pos = 0;
			}
			ip = weiIps.get(pos);
			pos++;
		}
		return ip;
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
