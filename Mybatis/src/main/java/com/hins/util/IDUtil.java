package com.hins.util;

import java.util.UUID;

/**
 * @author HinsChen
 */
public class IDUtil {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
