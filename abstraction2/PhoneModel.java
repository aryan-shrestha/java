package abstraction2;

abstract class PhoneModel {
    abstract void useOS();
    abstract void startUpScreen();
}

// abstract are created to create a model for other class that inherit from them
// object cannot be initiated with abstract class
// child class must override the abstract method of the parent abstract class
// child class can also be a new abstract class extend from a parent abstract class