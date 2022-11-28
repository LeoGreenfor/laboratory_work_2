package main;

public class Main {
    static FirstStream firstStream;
    static SecondStream secondStream;
    private static Counter counter = new Counter();
    private static AnotherCounter anotherCounter = new AnotherCounter();

    public static void main(String[] args)
    {
        /*firstStream = new FirstStream(counter);
        secondStream = new SecondStream(counter);
        firstStream.start();
        secondStream.start();*/

        firstStream = new FirstStream(anotherCounter);
        secondStream = new SecondStream(anotherCounter);
        firstStream.start();
        secondStream.start();

    }
}
