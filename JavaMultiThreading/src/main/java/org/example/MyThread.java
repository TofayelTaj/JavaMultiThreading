package org.example;

public class MyThread implements Runnable{
    @Override
    public void run() {
//        System.out.println("inside MyThread.....");
        for(int i = 1; i < 11; i++){
            System.out.println("My Thread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
