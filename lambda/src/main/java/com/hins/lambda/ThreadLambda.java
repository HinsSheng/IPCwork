package com.hins.lambda;

public class ThreadLambda {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            int key =1;
            while (key<=100){
                System.out.println("线程一 执行第   "+key+"次");
                key++;
            }
        }; Runnable runnable2 = () -> {
            int key =1;
            while (key<=100){
                System.out.println("线程二  执行第   "+key+"次");
                key++;
            }
        };
      new Thread(runnable1).start();
      new Thread(runnable2).start();

    }
}
