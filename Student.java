import java.util.Scanner;

public class Student {

    public String name;
    public int age;
    public String major;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Major: " + major);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter the student's Name: ");
        student.name = input.nextLine();
        System.out.print("Enter the student's Age: ");
        student.age = input.nextInt();
        input.nextLine(); // to consume the \n from the previous input
        System.out.print("Enter the student's Major: ");
        student.major = input.nextLine();

        student.display();
    }
}
