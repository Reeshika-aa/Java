import java.util.Scanner;

public class percent {
    public static void main(String[] args) {
        System.out.println("calculating percentage of students through marks of 5 subj!! (OUT OF 100)");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subj 1:");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of subj 2:");
        int eng = sc.nextInt();
        System.out.println("Enter the marks of subj 3:");
        int sci = sc.nextInt();
        System.out.println("Enter the marks of subj 4:");
        int gk = sc.nextInt();
        System.out.println("Enter the marks of subj 5:");
        int ss = sc.nextInt();
        int total = maths + eng + sci + gk + ss;
        float per = ((float) total / 500) * 100;
        System.out.println("Percentage is: " + per);

    }
}