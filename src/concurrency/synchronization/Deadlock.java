/**
 * When deadlock runs, both threads will block when they attempt to invoke method bowBack
 * Neither block will ever end, since each thread is waiting for the other to exit the bow method
 */
package concurrency.synchronization;

public class Deadlock {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
        }

        public static void main(String[] args) {
            final Friend inspector = new Friend("Inspector");
            final Friend ibrahim = new Friend("Ibrahim");

            new Thread(new Runnable() {
                @Override
                public void run() { inspector.bow(ibrahim); }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() { ibrahim.bow(inspector); }
            }).start();
        }
    }
}
