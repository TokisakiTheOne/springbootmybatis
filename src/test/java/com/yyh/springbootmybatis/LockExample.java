package com.yyh.springbootmybatis;

import java.util.concurrent.TimeUnit;

/**
 * @author YanYuHang
 * @create 2020-05-06-14:17
 */
public class LockExample {

    public static void main(String[] args) {
        synchronized (LockExample.class){
            System.out.println("lock");
        }


       // deadLock();
    }


    /**
     * 死锁
     */

    private static void deadLock() {
        //创建两个对象
        //线程一拥有的资源
        Object lock1 = new Object();
        //线程二拥有的资源
        Object lock2 = new Object();

        //线程一拥有 lock1 试图获取lock2

        //创建线程一
        new Thread(() -> {
            //同步锁
           synchronized (lock1){
               System.out.println("获取  lock1成功");
               try {
                   TimeUnit.SECONDS.sleep(3);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //视图获取锁 lock2
               synchronized (lock2){
                   System.out.println(Thread.currentThread().getName());
               }
           }
         }).start();
       //创建线程二
        new Thread(() -> {
            //同步锁
            synchronized (lock2){
                System.out.println("获取  lock2成功");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //视图获取锁 lock1
                synchronized (lock1){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();

    }


}
