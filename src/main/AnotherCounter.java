package main;

public class AnotherCounter extends Thread{
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void increment(String nameStream) throws InterruptedException {
        int a, c = 0;
        synchronized (lock1) {
                a = c;
                a++;
                c = a;
        }
        System.out.println(nameStream + " - " + c);
    }

    public void decrement(String nameStream) throws InterruptedException {
        int a, c = 0;
        synchronized (lock2) {
                a = c;
                a--;
                c = a;
        }
        System.out.println(nameStream + " - " + c);
    }
}
