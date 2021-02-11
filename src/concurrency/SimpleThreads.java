package concurrency;

public class SimpleThreads {

    // Display a message, preceded by the name of the current  thread
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable {
        public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "Kids eat ivy too"
            };
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //  Delay, in milliseconds before we interrupt MessageLoop thread (default one hour).
        long patience = 1000 * 60 * 60;

        //  If command line argument present, give patience in seconds.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread thread = new Thread(new MessageLoop());
        thread.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        //  loop until the MessageLoop thread exists
        while (thread.isAlive()) {

            threadMessage("Still waiting...");
            //  Wait for maximum of 1 second for MessageLoop thread to finish.
            thread.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience) && thread.isAlive()) {
                threadMessage("Tired of waiting!");
                thread.interrupt();
                //  Shouldn't be long now -- waiting indefinitely
                thread.join();
            }
        }
        threadMessage("Finally!");
    }
}
