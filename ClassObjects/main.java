package ClassObjects;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter anything: ");
        String x = sc.nextLine();

        System.out.println(x);

        NewClass obj = new NewClass();
        obj.newMethod();
        System.out.println(obj.returnableMethod());
    }

    
}
