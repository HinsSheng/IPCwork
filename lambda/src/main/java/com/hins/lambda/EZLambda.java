package com.hins.lambda;

public class EZLambda {
    static int a = 10;
    static int b = 20;
    static int c = 30;
    static String key = "字符串参数";

    public static void main(String[] args) {
        /** OneLambda lambda = new OneLambda() {
        @Override public void print() {
        System.out.println("匿名内部类");
        }
        };
         lambda.print(); */
        OneLambda onelambda = () -> System.out.println("无参无返回lambda");
        ;
        onelambda.print();

        TwoLambda twoLambda = a -> {
            System.out.println("一参有无返回" + a);
        };
        twoLambda.print(a);

        ThreeLambda threeLambda = (a, b, c) -> {
            int count = a + b + c;
            System.out.println("同类型多参无返回" + count);
        };
        threeLambda.print(a, b, c);

        FourLambda fourLambda = (int i, String j, int k) -> {
            String count = i + j + k;
            System.out.println(count);
        };
        fourLambda.print(a, key, b);
        System.out.println("==================返回值分割线=====================");

        FiveLambda fiveLambda = () -> {
            System.out.println("无参有返回");
            return a;
        };
        int res = fiveLambda.callBack();
        System.out.println(res);

        SixLambda sixLambda = (j) -> {
            System.out.println("一参有返回");
            return j;
        };
        sixLambda.callBack(a);
        SevenLambda sevenLambda = (j, k) -> {
            System.out.println("同类型多参数有返回");
            return k + j + "";
        };
        sevenLambda.callBack(a, b);
        EitLambda eitLambda = (int i, String j, int k) -> {
            System.out.println("多类型多参数有返回值");
            return i + j + k;
        };
        eitLambda.callBack(b, key, c);
        //只有一条语句 return可以省略
        SixLambda sixLambda02 = i -> i + 4;

        System.out.println(sixLambda02.callBack(5));
    }
}

//无参无返回
@FunctionalInterface
interface OneLambda {
    void print();
}

//一参无返回
@FunctionalInterface
interface TwoLambda {
    void print(int a);
}

//同类型多参无返回
@FunctionalInterface
interface ThreeLambda {
    void print(int a, int b, int c);
}

//多类型多参无返回
@FunctionalInterface
interface FourLambda {
    void print(int a, String i, int c);
}

//无参有返回
@FunctionalInterface
interface FiveLambda {
    int callBack();
}

//一参有返回
@FunctionalInterface
interface SixLambda {
    int callBack(int a);
}

//同类型多参有返回
@FunctionalInterface
interface SevenLambda {
    String callBack(int a, int b);
}

//多类型多参有返回
@FunctionalInterface
interface EitLambda {
    String callBack(int a, String b, int c);
}


