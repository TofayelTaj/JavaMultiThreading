package org.example;

public class MyThread implements Runnable{
    @Override
    public void run() {
//        System.out.println("inside MyThread.....");
        for(int i = 1; i < 11; i++){
            System.out.println("Value of i : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
