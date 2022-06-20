package abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        // Parent parentObj = new Parent(); error
        ChildClass childClassObj = new ChildClass();
        ChildClass2 childClass2Obk = new ChildClass2();

        childClassObj.greet();
        childClass2Obk.greet();

    }
}

// abstract are created to create a model for other class that inherit from them
// object cannot be initiated with abstract class
// child class must override the abstract method of the parent abstract class
// child class can also be a new abstract class extend from a parent abstract class