import java.util.ArrayList;
import java.util.Iterator;
/**
 * Represents a phone book containing a number of
 * persons/people.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneBook
{
    private ArrayList<Person>  listOfPersons;

    /**
     * Constructor for objects of class PhoneBook
     */
    public PhoneBook()
    {
        this.listOfPersons = new ArrayList<Person>();
    }
    
    public void addPerson(Person person)
    {
        this.listOfPersons.add(person);
    }
    
    public void listAllPersons()
    {
        for (int index = 0; index < listOfPersons.size(); index++)
        {
            Person p = listOfPersons.get(index);
            System.out.println(p.getDetailsAsString());
        }
    }
    
    public void listAllPersons2()
    {
        for (Person p:this.listOfPersons)
        {
            System.out.println(p.getDetailsAsString());          
        }
    }
    
    
    public Person getPersonByName(String name)
    {
        Person foundPerson = null;
        
        for (Person p:this.listOfPersons)
        {
           if (p.getName().equals(name))
           {
               foundPerson = p;  
            }
        }
        return foundPerson;
    }
    
    
    public Person getPersonByName2(String name)
    {
        Person foundPerson = null;
        int index = 0;
        
        while ((null == foundPerson) && (index < this.listOfPersons.size()))
        {
           Person p = this.listOfPersons.get(index++);
           if (p.getName().equals(name))
           {
               foundPerson = p;  
            }
        }
        return foundPerson;
    }
    
    
        public Person getPersonByName3(String name)
    {
        Person foundPerson = null;
        int index = 0;
        Iterator<Person> it = this.listOfPersons.iterator();
        while ((null == foundPerson) && (it.hasNext()))
        {
           Person p = it.next();
           if (p.getName().equals(name))
           {
               foundPerson = p;  
            }
        }
        return foundPerson;
    }
    
    public void fillPhoneBookWithPersons()
    {
        listOfPersons.add( new Person("Arne Styve", "78374837"));
        listOfPersons.add( new Person("Jens Olsen", "54125154"));
        listOfPersons.add( new Person("Lise Mathisen", "76237762"));
        listOfPersons.add( new Person("Håkon Jensen", "981278128"));
        listOfPersons.add( new Person("Ivar Iversen", "676273227"));
        listOfPersons.add( new Person("Trude Lutt", "672673272"));
        listOfPersons.add( new Person("Inge N. Hjemme", "88787322"));
    }
}
