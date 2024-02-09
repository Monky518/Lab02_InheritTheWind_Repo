public class Worker extends Person
{
    double hourlyPayRate;

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                " hourlyPayRate=" + hourlyPayRate +
                "}";
    }

    public Worker(String IDNum, String firstName, String lastName, int YOB, double hourlyPayRate)  // add data
    {
        super(IDNum, firstName, lastName, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, double hourlyPayRate) // add student data with person data based on first name
    {
        super(person.getIDNum(),
                person.getFirstName(),
                person.getLastName(),
                person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calcWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40.0)
        {
            return (40 + ((hoursWorked - 40) * 1.5)) * hourlyPayRate;
        }
        else
        {
            return hoursWorked * hourlyPayRate;
        }
    }

    public String displayWeeklyPay (double hoursWorked)
    {
        if (hoursWorked > 40.0)
        {
            return "Weekly Pay: " + calcWeeklyPay(40.0) + "and Over Time: " + (calcWeeklyPay(hoursWorked) - calcWeeklyPay(40.0));
        }
        else
        {
            return "Weekly Pay: " + calcWeeklyPay(hoursWorked);
        }
    }
}