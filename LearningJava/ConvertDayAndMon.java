package LearningJava;

import java.util.Scanner;

public class ConvertDayAndMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number days: ");
        int days = sc.nextInt();
        int months = days / 30;
        int remDays = days % 30;
        System.out.println(days + " days is equal to " + months + " months and " + remDays + " days");

    }
}
