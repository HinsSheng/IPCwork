package com.hins.service.impl;

import com.hins.entity.Any;
import com.hins.service.AnyServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnyServiceImpl implements AnyServive {
    @Autowired
    private Any any;
    @Override
    public void getAny() {
        any.printHashCode();

    }
}
