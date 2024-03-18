import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking input from the user for the sum:");
        System.out.println("Enter a number 1 of your choice:");
        int a = sc.nextInt();
        System.out.println("Enter a number 2 of your choice:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

    }
}