import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    @Test
    void calculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Ethan", "Lawhorn", "001", "Mr.", 2001, 20.0, 52000);
        assertEquals(1000, salaryWorker.calculateWeeklyPay(40));
        assertEquals(1000, salaryWorker.calculateWeeklyPay(50));
    }

    @Test
    void displayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Ethan", "Lawhorn", "001", "Mr.", 2001, 20.0, 52000);
        assertEquals("Weekly Pay (fraction of yearly salary): 1000.00", salaryWorker.displayWeeklyPay(40));
        assertEquals("Weekly Pay (fraction of yearly salary): 1000.00", salaryWorker.displayWeeklyPay(50));
    }
}