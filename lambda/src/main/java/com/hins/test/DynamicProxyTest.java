package com.hins.test;

import com.hins.design.proxy.Flow;
import com.hins.design.proxy.impl.DynamicProxyHandler;
import com.hins.design.proxy.impl.FlowImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Flow flow = new FlowImpl();
        Flow flowproxy = (Flow)Proxy.newProxyInstance(Flow.class.getClassLoader(),
                new Class[]{Flow.class},
                new DynamicProxyHandler(flow));
        flowproxy.add();
        System.out.println();
        flowproxy.delete();
    }
}
