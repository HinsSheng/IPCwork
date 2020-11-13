package com.hins.service.impl;

import com.hins.service.FlowService;
import org.springframework.stereotype.Service;

@Service
public class FlowServiceNextIml implements FlowService {
    @Override
    public void controlFlow() {
        System.out.println("第二个实现");
    }

    @Override
    public String changeKey(String key) {
        System.out.println("第二个实现");
        return "多实现";
    }
}
