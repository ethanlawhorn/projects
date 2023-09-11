import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Ethan", "Lawhorn", "001", "Mr.", 2001, 20.0));
        workers.add(new Worker("Sam", "Ream", "002", "Mr.", 2000, 15.0));
        workers.add(new Worker("Sheridan", "Barry", "003", "Mrs.", 2001, 10.0));
        workers.add(new SalaryWorker("Bryce", "Guion", "004", "Mr.", 2002, 18.0, 80000));
        workers.add(new SalaryWorker("Tommy", "Young", "005", "Mr.", 2002, 22.0, 100000));
        workers.add(new SalaryWorker("Samantha", "Gambill", "006", "Mrs.", 1976, 15.0, 50000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}