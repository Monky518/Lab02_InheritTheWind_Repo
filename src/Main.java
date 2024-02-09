import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        // Create 3 workers and 3 salaryWorker instances and add them to an ArrayList<Worker>
        // Pick reasonable hourly rates for the workers and reasonable salary rates for the salary workers
        // Of course all workers have names, ids, and YOBs.

        // Write a loop that simulates 3 weekly pay periods
        // Week 1 is a 40-hour week
        // For week 2, assume it is crunch time and everyone worked 50 hours
        // Week 3 is back to normal with 40 hours
        // Generate a display showing the weekly pay for each of the workers for each week in a reasonable tabular format

        ArrayList<Worker> employees = new ArrayList<>();

        Worker emily = new Worker("000001", "Emily", "Kill", "Mrs.", 1990, 21.5);
        employees.add(emily);
        Worker john = new Worker("000002", "John", "Smith", "Mr.", 2001, 17.3);
        employees.add(john);
        Worker sarah = new Worker("000003", "Sarah", "Rose", "Ms.", 1975, 26.2);
        employees.add(sarah);

        SalaryWorker sam = new SalaryWorker("000005", "Sam", "Kill","Mrs.", 1990, 0.0, 60000.1);
        employees.add(sam);
        SalaryWorker jack = new SalaryWorker("000006", "Jack", "Vent", "Mr.", 1983, 0.0, 58656.0);
        employees.add(jack);
        SalaryWorker sky = new SalaryWorker("000007", "Sky", "Kill", "Dr.", 1990, 0.0, 65010.5);
        employees.add(sky);

        System.out.println("   Week One   \n==============\n");

        for (Worker worker : employees)
        {
            System.out.println(worker + ": " + worker.displayWeeklyPay(40));
        }

        System.out.println("\n   Week Two   \n==============\n");

        for (Worker worker : employees)
        {
            System.out.println(worker + ": " + worker.displayWeeklyPay(50));
        }

        System.out.println("\n  Week Three  \n==============\n");

        for (Worker worker : employees)
        {
            System.out.println(worker + ": " + worker.displayWeeklyPay(40));
        }
    }
}
