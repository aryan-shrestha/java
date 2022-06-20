package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Srijana");
        obj.setSid(24);

        System.out.println("SID: " + obj.getSid());
        System.out.println("Name: " + obj.getName());
    }
}
