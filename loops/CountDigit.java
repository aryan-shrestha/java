package loops;

public class CountDigit {
    public static void main (String args[]) {
        int c = 0;
        int num = 123;
        while (num!=0){
            num = num/10;
            c++;
        }

        System.out.println("Total Digit: "+ c);
    }
}
