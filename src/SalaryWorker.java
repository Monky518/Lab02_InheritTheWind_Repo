public class SalaryWorker extends Worker
{
    double annualSalary;

    @Override
    public String toString() {
        return "SalaryWorker{" +
                super.toString() +
                " annualSalary=" + annualSalary +
                "}";
    }

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calcWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return "A week of your annual salary: " + calcWeeklyPay(0.0);
    }
}
