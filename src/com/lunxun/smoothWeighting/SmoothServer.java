package com.lunxun.smoothWeighting;

public class SmoothServer {
	public SmoothServer(String ip, int weight, int curWeight) {
        this.ip = ip;
        this.weight = weight;
        this.curWeight = curWeight;
    }

    private String ip;

    private int weight;

    private int curWeight;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCurWeight() {
        return curWeight;
    }

    public void setCurWeight(int curWeight) {
        this.curWeight = curWeight;
    }

	@Override
	public String toString() {
		return "SmoothServer [ip=" + ip + ", weight=" + weight + ", curWeight=" + curWeight + "]";
	}
    
    
}
