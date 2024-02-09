public class Student extends Person
{
    int gradeLevel; // 0 - 12

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                " gradeLevel=" + gradeLevel +
                "}";
    }



    public Student(String IDNum, String firstName, String lastName, int YOB, int gradeLvl)  // add data
    {
        super(IDNum, firstName, lastName, YOB);
        this.gradeLevel = gradeLvl;
    }

    public Student(Person person, int gradeLvl) // add student data with person data based on first name
    {
        super(person.getIDNum(),
                person.getFirstName(),
                person.getLastName(),
                person.getYOB());
        this.gradeLevel = gradeLvl;
    }
}