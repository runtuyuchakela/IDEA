package com.sx.sch.test.thread;
import java.lang.Thread;
public class t1_create {
    public static void main(String[] args) throws InterruptedException {
        //Thread继承创建线程
        Thread_1 t=new Thread_1();
        Thread_1 t1=new Thread_1();
        t.start();
        t1.start();
        //实现Runnable接口创建线程
//        MyThread myThread=new MyThread();
//        Thread t3=new Thread(myThread);
//        t3.run();
//        t3.start();
//            //匿名内部类
//            Thread t4=new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for(int i=0;i<10;i++){
//                        System.out.println(Thread.currentThread().getName()+":"+i);
//                    }
//                }
//            });
//            t4.start();

    }
}
class Thread_1 extends Thread{
    public static volatile int a;
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i+" "+a++
                    +Thread.currentThread().getState()+" "
                    +Thread.currentThread().getContextClassLoader()+" "
                    +Thread.currentThread().getPriority()+" "
                    +Thread.currentThread().getId());
        }
    }
}
class MyThread implements Runnable{
    public volatile int a;
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i+""+a++);
        }
    }
}