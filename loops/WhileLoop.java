package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: 1");
        int x = sc.nextInt();
        
        while (x != 10) {
            System.out.println("Type 10....");
            System.out.print("Type a number: ");
            x = sc.nextInt();
        }
    }
}
