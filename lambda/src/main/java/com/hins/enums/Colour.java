package com.hins.enums;

/**
 * @author HinsChen
 */

public enum Colour {

    //    public static final int RED = 1;
////    public static final int BLUE = 2;
////    public static final int YELL = 3;
////    public static final int BLACK = 4;
////    public static final int WHITE = 5;
////    public static final int GREEN = 6;
    RED("红"),
    BLUE("蓝"),
    YELL("黄"),
    BLACK("黑"),
    WHITE("白"),
    GREEN("绿");
    //RED,BLUE,YELL,BLACK,WHITE,GREEN;
    private String describe;

    private Colour(String describe) {
        this.describe = describe;
    }
    public  String getDescribe(){
        return this.describe;
    }
}

