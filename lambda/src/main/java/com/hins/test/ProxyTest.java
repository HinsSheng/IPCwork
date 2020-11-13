package com.hins.test;

import com.hins.design.proxy.Flow;
import com.hins.design.proxy.impl.FlowImpl;
import com.hins.design.proxy.impl.FlowProxy;

public class ProxyTest {
    public static void main(String[] args) {
        Flow flow = new FlowImpl();
        FlowProxy flowProxy = new FlowProxy(flow);
        flowProxy.add();
        flowProxy.delete();
    }
}
