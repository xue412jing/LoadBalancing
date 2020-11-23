package com.lunxun.smoothWeighting;

import java.util.ArrayList;
import java.util.List;

public class SmoothWeightRoundRobin {
	 /**初始化所有的服务器**/
    List<SmoothServer> servers = new ArrayList<>();

    /**服务器权重总和*/
    private int weightCount;

    public void init(List<SmoothServer> servers) {
        this.servers = servers;
        this.weightCount = this.servers.stream().map(server -> server.getWeight()).reduce(0, (l, r) -> l + r);

    }

    /**
     * 获取需要执行的服务器
     * 获取权值最大的服务器
     **/
    public SmoothServer getServer() {
        SmoothServer tmpSv = null;

        for (SmoothServer sv : servers) {
            sv.setCurWeight(sv.getWeight() + sv.getCurWeight());
            if (tmpSv == null || tmpSv.getCurWeight() < sv.getCurWeight()) {
            	tmpSv = sv;
            }
        }

        tmpSv.setCurWeight(tmpSv.getCurWeight() - weightCount);
        return tmpSv;
    }

}
