package com.hins.design.proxy.impl;

import com.hins.design.proxy.Flow;

public class FlowImpl implements Flow {
    @Override
    public void add() {
        System.out.println("执行添加方法");
    }

    @Override
    public void delete() {
        System.out.println("执行删除方法");
    }
}
