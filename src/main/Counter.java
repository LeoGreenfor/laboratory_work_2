package main;

class Counter extends Thread{
    private int c = 0;

    public synchronized void increment() throws InterruptedException {
        int a;
        sleep(150);
        a = c;
        a++;
        c = a;
    }

    public synchronized void decrement() throws InterruptedException {
        int a;
        sleep(100);
        a = c;
        a--;
        c = a;
    }
    public synchronized int value() {
        return c;
    }
}
