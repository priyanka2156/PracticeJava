package LearningJava;

public class SwaptwoNum {
    public static void main(String[] args) {
        // Swapping two numbers without using third variables
        int n1 = 20, n2 = 30;
        System.out.println("Before Swapping: " + n1 + " " + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After Swapping: " + n1 + " " + n2);
    }
}
