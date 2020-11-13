package com.hins.dao.impl;

import com.hins.dao.FlowEndDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class FlowEndDaoImpl implements FlowEndDao {
    @Override
    public void end() {
        System.out.println("流程结束");
    }

    @Override
    public String lost(String key) {
        System.out.println(this.getClass().getName()+"方法被执行");
        return "获取到key  = "+key;
    }
}
