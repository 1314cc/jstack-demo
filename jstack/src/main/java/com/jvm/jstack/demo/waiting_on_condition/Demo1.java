package com.jvm.jstack.demo.waiting_on_condition;

public class Demo1 {


    private static String Monitor = "monitor";


    /**
     * 创建两个线程. thread 1 , thread 2
     * 同一个锁, Monitor
     * 一个线程获取锁后, 另外一个等待锁.
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Demo1Run demo1Run = new Demo1Run();

        Thread thread1 = new Thread(demo1Run);
        thread1.setName("thread-1");

        Thread thread2 = new Thread(demo1Run);
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


    public static class Demo1Run implements Runnable {
        @Override
        public void run() {
            synchronized (Monitor) {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " is Run!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
