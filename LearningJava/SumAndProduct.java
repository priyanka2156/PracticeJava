package LearningJava;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the sum of the number: ");
        int num1 = sc.nextInt();
        System.out.println(" Enter the number for sum: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int prod = num1 * num2;
        System.out.println(" The Sum of the two numbers are " + sum);
        System.out.println(" The Product of the two numbers are " + prod);

    }
}
