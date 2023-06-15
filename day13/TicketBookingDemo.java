package day13;

public class TicketBookingDemo {

    public static void main(String[] args) throws InterruptedException {
        // Create a ticket booking system with 10 tickets
        TicketBookingSystem system = new TicketBookingSystem(10);

        // Create 5 threads to book tickets
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        // Try to book a ticket
                        if (system.bookTicket()) {
                            System.out.println("Booked a ticket!");
                        } else {
                            System.out.println("No tickets available!");
                            break;
                        }
                    }
                }
            });
        }

        // Start the threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for the threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        // Print the number of available tickets
        System.out.println("Number of available tickets: " + system.getNumAvailableTickets());
    }
}
