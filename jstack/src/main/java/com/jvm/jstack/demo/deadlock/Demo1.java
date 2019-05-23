package com.jvm.jstack.demo.deadlock;

public class Demo1 {

    private static String Monitor_1 = "Monitor_1";
    private static String Monitor_2 = "Monitor_2";

    /**
     * 死锁, 两个线程, 拥有一个锁的同时,去获取另外一个锁.
     *
     * @param args
     */
    public static void main(String[] args) {
        DeadLockRun1 deadLockRun1 = new DeadLockRun1();
        DeadLockRun2 deadLockRun2 = new DeadLockRun2();


        Thread thread1 = new Thread(deadLockRun1);
        thread1.setName("thread-1");

        Thread thread2 = new Thread(deadLockRun2);
        thread2.setName("thread-2");

        thread1.start();
        thread2.start();


        System.out.println("Thread 1 ID is : " + thread1.getId());
        System.out.println("Thread 2 ID is : " + thread2.getId());


        try {
            // 等待所有线程执行完毕
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("done!");
    }

    public static class DeadLockRun1 implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (Monitor_1){
                    System.out.println(Thread.currentThread().getName() + " get Lock 1  " + Monitor_1);
                    synchronized (Monitor_2){
                        System.out.println(Thread.currentThread().getName() + " get Lock 2 " + Monitor_2);
                    }
                }
            }
        }
    }

    public static class DeadLockRun2 implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (Monitor_2){
                    System.out.println(Thread.currentThread().getName() + " get Lock 1  " + Monitor_2);
                    synchronized (Monitor_1){
                        System.out.println(Thread.currentThread().getName() + " get Lock 2 " + Monitor_1);
                    }
                }
            }
        }
    }
}
