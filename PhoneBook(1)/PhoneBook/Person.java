
/**
 * Represents a single person, holding information
 * about the name and the phone number of that person.
 *
 * @author Arne 
 * @version 2018-01-31
 */
public class Person
{
    private String name;
    private String phoneNumber; 
    private int age;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name)
    {
        this.name = name;
        this.phoneNumber = "";
    }
    
    /**
     * 
     */
    public Person(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    /**
     * Returns the name of the person
     * @return the name of the person
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * 
     */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public int getAge()
    {
        return this.age;
     }
    
    /**
     * 
     */
    public String getDetailsAsString()
    {
        return this.name + ", " + this.phoneNumber;
    }
}
