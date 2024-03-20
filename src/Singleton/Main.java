package Singleton;

public class Main {

    public static void main(String[] args) {

        //Initial code
        DatabaseConnection db = DatabaseConnection.getInstance();
        DatabaseConnection db1= DatabaseConnection.getInstance();

        // Create multiple threads
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    // Runnable implementation to demonstrate multi-threading
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            DatabaseConnection db = DatabaseConnection.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + db.hashCode());
        }
    }
}


//Steps:
//1. Make constructor as private
//2. Create getInstance method and make it as static
//3. Make the variable as static - Static methods will access only static vars

//Multi threading
//1. Eager/Lazy Initialization : Static methods app load time
//2. Double lock