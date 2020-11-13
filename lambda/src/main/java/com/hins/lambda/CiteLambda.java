package com.hins.lambda;

public class CiteLambda {
    public static void main(String[] args) {
        NextLambda nextLambda01 = num -> doubleNum(num);
        System.out.println(nextLambda01.ReturnOneParam(5));
        System.out.println("==================分割线=====================");
        NextLambda nextLambda02 = CiteLambda::doubleNum;
        System.out.println(nextLambda02.ReturnOneParam(6));
        System.out.println("==================分割线=====================");
        CiteLambda citeLambda = new CiteLambda();
        NextLambda nextLambda03 = citeLambda::addThree;
        System.out.println(nextLambda03.ReturnOneParam(2));



    }

    public static int doubleNum(int a) {
        return a * 2;
    }

    protected  int addThree(int a) {
        return a + 3;
    }
}

@FunctionalInterface
interface NextLambda {
    int ReturnOneParam(int num);
}