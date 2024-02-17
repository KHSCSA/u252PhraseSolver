public class Example {
    public static void main (String [] args){
  
        // we can construct a 'Haircut' object
        Haircut cut = new Haircut("short");
    
        // construct a Person object
        Person notMe = new Person("Chris", 44, "old school");
        System.out.println(notMe);
    
        // construct a Student object
        Student stillNotMe = new Student("Jo", 16, "mohawk", 1234, "KHS");
        System.out.println(stillNotMe);
    
    } // close main
} // close Main
  
  
class Haircut{
    private String style;
    private double cost;
     
    public Haircut(String styleParam){
        style = styleParam;
        if (style == "old school") cost = 14.99;   
        else cost = 24.99;
    }
  
    public String toString(){
        return this.style;
    }
} // close Haircut class
  
class Student extends Person{
    // the Student class inherits all attributes and methods from the Person class
    // we can define additional attributes and methods
    private int idNum;
    private String school;
  
    // we'll need to pass the parameters required for a Person
    // plus additional parameters for a Student
    public Student(String nameP, int ageP, String cutP, int idP, String schoolP){
        // this must be the first call
        //super(nameP, ageP, cutP); // initializing the attributes for a Person
        this.name = nameP;
        this.age = ageP;
        this.cut = new Haircut(cutP);
        this.idNum = idP;
        this.school = schoolP;
    }
  
    public String toString(){
        String temp = super.toString(); // calling the toString method in Person
        temp += "\nthis student has idnum " + this.idNum;
        temp += " and goes to " + this.school;
        return temp;
    }
    
} // close Student class
  
  
class Person {
    protected int age;
    protected String name;
    protected Haircut cut; // a 'Person' "has-a" Haircut
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
  
    public String toString(){
        return this.name + " " + this.age + " " + this.cut;
    }
  
} // close Person class