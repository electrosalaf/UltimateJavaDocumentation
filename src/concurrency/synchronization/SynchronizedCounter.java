package concurrency.synchronization;

public class SynchronizedCounter {
    private int c = 0;

    private String lastName;
    private String[] nameList;
    private int nameCount;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

    public void addNumber(String name) {
        synchronized (this) {
            lastName = name;
            nameCount++;
        }


    }
}
