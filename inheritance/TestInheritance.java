package inheritance;


public class TestInheritance {
    public static void main(String[] args) {
        Sparrow sparrowObj = new Sparrow();
        Crow crowObj = new Crow();

        sparrowObj.fly();
        crowObj.fly();
        crowObj.eat();
    }
}
