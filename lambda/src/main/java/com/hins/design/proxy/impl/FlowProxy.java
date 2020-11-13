package com.hins.design.proxy.impl;

import com.hins.design.proxy.Flow;

public class FlowProxy implements Flow {
    private Flow flow;

    public FlowProxy(Flow flow) {
        this.flow = flow;
    }

    @Override
    public void add() {
        System.out.println("已被代理");
        flow.add();
    }

    @Override
    public void delete() {
        System.out.println("已被代理");
        flow.delete();
    }
}
