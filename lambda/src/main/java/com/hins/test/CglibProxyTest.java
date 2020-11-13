package com.hins.test;

import com.hins.design.proxy.Flow;
import com.hins.design.proxy.impl.CglibProxy;
import com.hins.design.proxy.impl.FlowImpl;

public class CglibProxyTest {
    public static void main(String[] args) {
        Flow flow = new FlowImpl();
        CglibProxy cglibProxy = new CglibProxy();
        Flow instance = (Flow)cglibProxy.getInstance(flow);
        instance.add();
        System.out.println();
        instance.delete();
    }
}
