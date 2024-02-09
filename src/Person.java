import java.time.Year;
import java.util.Objects;

public class Person
{
    private String IDNum;
    private String firstName;
    private String lastName;
    private String title;       // add this everywhere later
    private int YOB;
    static private int IDSeed =  1;

    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }

    public static int getIDSeed() {
        return IDSeed;
    }

    public Person(String IDNum, String firstName, String lastName, int YOB) // add data
    {
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }

    public Person(String firstName, String lastName, int YOB)   // add data with generated ID
    {
        this.IDNum = this.genIDNum();
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }


    public String getIDNum() {
        return IDNum;
    }

    private String genIDNum() {
        String newID = "" + IDSeed;
        while(newID.length() < 8)
        {
            newID = "0" + newID;
        }

        IDSeed++;

        return newID;
    }

    public String fullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + fullName();
    }

    public int getAge()
    {
        return Year.now().getValue() - YOB;
    }

    public int getAge(int year)
    {
        return Year.now().getValue() - year;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + IDNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && IDNum.equals(person.IDNum) && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    public String toJSONRecord()
    {
        String retString = "";
        char DQ = '\u0022';  // Assign the double quote char to a variable
        retString =  "{" + DQ + "IDNum" + DQ + ":" + DQ + this.IDNum + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        retString += " " + DQ + "lastName"  + DQ + ":" + DQ + this.lastName + DQ + ",";
        retString += " " + DQ + "YOB"  + DQ + ":" + this.YOB + "}";

        return retString;
    }

    public String toXMLRecord()
    {
        String retString = "";

        retString = "<Person>" + "<IDNum>" + this.IDNum + "</IDNum>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<YOB>" + this.YOB + "</YOB></Person>";

        return retString;
    }
    public String toCSVRecord() {
        return  this.IDNum + ", " + this.firstName + "," + this.lastName + "," + YOB;
    }
}