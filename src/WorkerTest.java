import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    @Test
    void calculateWeeklyPay() {
        Worker worker = new Worker("Ethan", "Lawhorn", "001", "Mr.", 2001, 20.0);
        assertEquals(800, worker.calculateWeeklyPay(40));
        assertEquals(1100, worker.calculateWeeklyPay(50));
    }

    @Test
    void displayWeeklyPay() {
        Worker worker = new Worker("Ethan", "Lawhorn", "001", "Mr.", 2001, 20.0);
        assertEquals("Weekly Pay: 800.00", worker.displayWeeklyPay(40));
        assertEquals("Weekly Pay: 1100.00", worker.displayWeeklyPay(50));
    }
}