
//get the name from user and greet them 
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        // System.out.printf("Hello " + name + " , how are you today?");
        System.out.printf("Hello  %s, how are you today?", name);

    }
}