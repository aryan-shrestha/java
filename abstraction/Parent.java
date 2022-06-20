package abstraction;

abstract class Parent {
    public Parent(){
        System.out.println("Parent constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}
