package org.example;

public class Main {
    public static void main(String[] args) {
//        printing Main thread name
        System.out.println(Thread.currentThread().getName());
        MyThread1 myClass = new MyThread1();
        myClass.start();
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        Thread thread1 = new Thread(()->{
            System.out.println("this thread is created with lambda expression");
        }, "My Thread 1");
        thread1.start();
        System.out.println("Name of thread 1 : " + thread1.getName());

//        Daemon thread
        MyThread1 daemonThread = new MyThread1();
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println("is daemon : " + daemonThread.isDaemon());

    }
}