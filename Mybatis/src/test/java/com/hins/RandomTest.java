package com.hins;

import com.hins.util.IDUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.UUID;

public class RandomTest {
    @Test
    public void test(){
        String id = IDUtil.getId();
        System.out.println(UUID.randomUUID().toString());
        System.out.println(id);
    }
}
