package day13;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBookingSystem {

    private int numTickets;
    private Lock lock = new ReentrantLock();

    public TicketBookingSystem(int numTickets) {
        this.numTickets = numTickets;
    }

    public boolean bookTicket() {
        try {
            lock.lock();
            if (numTickets > 0) {
                numTickets--;
                return true;
            }
        } finally {
            lock.unlock();
        }
        return false;
    }

    public int getNumAvailableTickets() {
        return numTickets;
    }
}

