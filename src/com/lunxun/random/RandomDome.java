package com.lunxun.random;

import java.util.Random;

import com.lunxun.ServiceIps;


public class RandomDome {
	public static String getServer(){
		Random ran = new Random();
		int r = ran.nextInt(ServiceIps.serviceList.size());
		return ServiceIps.serviceList.get(r);
	}
public static void main(String[] args) {
	for(int i=0;i<10;i++){
		System.out.println(getServer());
	}
}
}
