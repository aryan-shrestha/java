package abstraction2;

public class testAbstraction {
    public static void main(String[] args) {
        // PhoneModel  phoneModelObj = new PhoneModel();
        Apple iPhone = new Apple();
        Samsung note = new Samsung();

        iPhone.useOS();
        iPhone.startUpScreen();

        note.useOS();
        note.startUpScreen();
    }
}
