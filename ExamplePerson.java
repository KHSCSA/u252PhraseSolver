public class Main {
    public static void main (String [] args){
        // look through the existing code
        // TODO 1, what classes are written?
        // TODO 2, what is the relationship between those classes?
        // TODO 3, define one new attribute for a Person
        // TODO 4, write the toString() method


        //construct a Person object
        Person me = new Person("Scott", 44, "old school");
        System.out.println(me);

    } // close main
} // close class

class Person {
    private int age;
    private String name;
    private Haircut cut; // a 'Person' "has-a" Haircut
    // this is known as "inheritance"

    //default constructor, initializes attributes to zero, blank, or null
    public Person(){
        age = 0;
        name = "";
        cut = null;
    }

    //constructor using parameters
    public Person(String nameParam, int ageParam, String cutParam){
        age = ageParam;
        name = nameParam;
        cut = new Haircut(cutParam);    
    }
    
} // close Person class


class Haircut{
    private String style;
    private double cost;

    public Haircut(String styleParam){
        style = styleParam;
        if (style == "old school") cost = 14.99;   
        else cost = 24.99;
    }

} // close Haircut class