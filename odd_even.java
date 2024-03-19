
// number is odd or even 
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of your choice: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number you entered " + num + " is Even");
        } else {
            System.out.println("The number you entered " + num + " is Odd");

        }

    }
}