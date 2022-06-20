class DogTestDrive {
  // main method
  public static void main (String [] args) {
    Dog d = new Dog();
    d.size = 40;
    d.bark();
    
    Dog d2 = new Dog();
    d2.size = 50;
    d2.bark();

    System.out.println(d.size);
    System.out.println(d2.size);

    d.eat("oreo", 1);  
    d2.eat("masu bhat", 2);
  }
}

class Dog {
  // instace variables 
  int size;
  String breed;
  String name;
  
  // a method
  void bark() {
    System.out.println("Ruff! Ruff!");
    System.out.println("I weigh " + this.size);
  }

  void eat(String snacks, int a) {
    System.out.println("I ate " + snacks + a);
  }
}


