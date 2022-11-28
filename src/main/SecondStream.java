package main;


public class SecondStream extends Thread{
    private Counter counter;
    private AnotherCounter anotherCounter;

    public SecondStream(Counter counter) {
        this.counter = counter;
    }
    public SecondStream(AnotherCounter anotherCounter){
        this.anotherCounter = anotherCounter;
    }

    @Override
    public void run() {
        try {
            //counter.decrement();
            //counter.increment();
            //System.out.println("Second stream - " + counter.value());

            //anotherCounter.increment("Second");
            anotherCounter.decrement("Second");
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }

}
