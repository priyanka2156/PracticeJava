package LearningJava;

public class SumOfAllInteger {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 150; i <= 290; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of Integers are " + sum);
    }
}
