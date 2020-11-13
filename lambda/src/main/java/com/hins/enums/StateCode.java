package com.hins.enums;

public enum StateCode {
    CODE_00A("00A"),
    CODE_00B("00B"),
    CODE_00C("00C"),
    CODE_00D("00D"),
    CODE_00E("00E"),
    CODE_00F("00F"),
    CODE_00G("00G"),
    CODE_00H("00H"),
    CODE_00X("00X");
    private String code;


    StateCode(String code) {
        this.code = code;
    }

    public static String CODE_00A() {
        return CODE_00A.code;
    }

    public static String CODE_00B() {
        return CODE_00B.code;
    }

    public static String CODE_00C() {
        return CODE_00C.code;
    }

    public static String CODE_00D() {
        return CODE_00D.code;
    }

    public static String CODE_00E() {
        return CODE_00E.code;
    }

    public static String CODE_00F() {
        return CODE_00F.code;
    }

    public static String CODE_00G() {
        return CODE_00G.code;
    }

    public static String CODE_00H() {
        return CODE_00H.code;
    }

    public static String CODE_00X() {
        return CODE_00X.code;
    }
}
