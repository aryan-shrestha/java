package input.output;
import java.util.Scanner;


public class Input {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String s = sc.nextLine();

        if (s.equals("tim")) {
            System.out.println("you are typed tim");
        } else {
            System.err.println("You are not tim");
        }
    }
}
