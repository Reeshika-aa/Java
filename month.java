//display the month of a year. Month of the year should be held in array. take the date from user

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String months[] = { "January", "February", "March", "April",
                "May", "June", "July",
                "August", "September", "October",
                "November", "December" };

        System.out.println("Enter the date in the  format dd/mm/yyyy:");
        String date = sc.nextLine();

        String[] parts = date.split("/");
        // -1 because index starts from 0
        int month = Integer.parseInt(parts[1]) - 1;

        if (month >= 0 && month < 12) {
            System.out.println(months[month]);
        } else {
            System.out.println("Invalid month entered.");
        }

    }
}