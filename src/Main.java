import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Person> folks = new ArrayList<>();    // set array
        Person sally = new Person("Sally", "Williams", 2005);   // add person(sally)
        System.out.println(sally);  // show person(sally)
        folks.add(sally);   // add person(sally) data to folks array
        sally.setLastName("Smith"); // change person(sally) last name   note: folks *is* updated
        System.out.println(sally);  // show updated person(sally)

        Person fred = new Person("Fred", "Williams", 2010); // add person(fred)
        System.out.println(fred);   // show person(fred)
        folks.add(fred);    // add person(fred) data to folks array

        Person homer = new Person("Homer", "Simpson", 1975);    // add person(homer)
        System.out.println(homer);  // show person(homer)
        folks.add(homer);   // add person(homer) data to folks array

        for(Person p: folks)
            System.out.println(p);

        System.out.println("\n\nNew Code for inheritance");

        Student lisa = new Student("00000002", "Lisa", "Simpson", 1985, 3); // add student data
        Student fredStudent = new Student(fred, 8); // add student data based on person first name

        System.out.println(lisa);
        System.out.println(fredStudent);

        System.out.println("\nFile Storage formats:");

        System.out.println("JSON: " + sally.toJSONRecord());
        System.out.println("XML:  " + sally.toXMLRecord());
        System.out.println("CSV:  "+ sally.toCSVRecord());

    }
}
