package main;

public class FirstStream extends Thread{
    public AnotherCounter anotherCounter;
    private Counter counter;

    public FirstStream(Counter counter) {
        this.counter = counter;
    }
    public FirstStream(AnotherCounter anotherCounter){
        this.anotherCounter = anotherCounter;
    }

    @Override
    public void run()
    {
        try {
            //counter.decrement();
            //counter.increment();
            //System.out.println("First stream - " + counter.value());

            //anotherCounter.increment("First");
            anotherCounter.decrement("First");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
