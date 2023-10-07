package LearningJava;

public class ArmstrongNum {
    public static void main(String[] args) {
        int Arms = 214;
        int check, rem, sum = 0;
        check = Arms;
        while (check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        if (sum == Arms) {
            System.out.println(" Number is an Armstrong number " + Arms);
        } else {
            System.out.println(" Number is not an Armstrong number " + Arms);
        }
    }
}
