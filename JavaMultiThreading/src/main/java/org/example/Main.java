package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        printing Main thread name
//        System.out.println(Thread.currentThread().getName());
//        MyThread1 myClass = new MyThread1();
//        myClass.start();
//        MyThread myThread = new MyThread();
//        Thread thread = new Thread(myThread);
//        thread.start();
//        Thread thread1 = new Thread(()->{
//            System.out.println("this thread is created with lambda expression");
//        }, "My Thread 1");
//        thread1.start();
//        System.out.println("Name of thread 1 : " + thread1.getName());

//        Daemon thread
//        MyThread1 daemonThread = new MyThread1();
//        daemonThread.setDaemon(true);
//        daemonThread.start();
//        System.out.println("is daemon : " + daemonThread.isDaemon());
//
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread);
//        thread1.start();
//        Thread.yield();
//        for(int i = 0; i<10; i++){
//            Thread.sleep(500);
//            System.out.println("main..");
//        }
//        System.out.println("Main Thread.......");

//        ...........thread join................//

        MyThread1 myThread1 = new MyThread1();
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        myThread1.setThread(thread);
        thread.start();
        myThread1.start();
        myThread1.join();

        for(int i = 0; i<10; i++){
            Thread.sleep(500);
            System.out.println("main thread : " + i);
        }


    }
}