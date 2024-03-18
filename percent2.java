
//percentage calculation using for loop
import java.util.Scanner;

public class percent2 {
    public static void main(String[] args) {
        System.out.println("calculating percentage of students through marks of 5 subj!! (OUT OF 100)");
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("enter the marks of subject " + (i + 1));
            marks[i] = sc.nextInt();

        }
        int total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        float per = ((float) total / 500) * 100;
        System.out.println("Percentage is: " + per);

    }
}