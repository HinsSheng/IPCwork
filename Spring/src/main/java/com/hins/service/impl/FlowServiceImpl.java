package com.hins.service.impl;

import com.hins.dao.FlowEndDao;
import com.hins.service.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowServiceImpl implements FlowService {
    @Autowired
    private FlowEndDao flowEndDao;
    @Override
    public void controlFlow() {
        flowEndDao.end();
    }

    @Override
    public String changeKey(String key) {
        return flowEndDao.lost(key);
    }
}
