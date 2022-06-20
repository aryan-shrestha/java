package Constructor;

public class Person {
   private String name, address;

// A constructor. It is a special method that is called when an object is created.
// parameterized constructor
    public Person (String name, String address){
        this.name  = name;
        this.address = address;
    }


/**
 * The function `sayMyName` prints the value of the variable `name` to the console
 */
    public void sayMyName() {
        System.out.println(name);
    }
    
}