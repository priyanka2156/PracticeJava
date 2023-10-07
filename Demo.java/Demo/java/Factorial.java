public class Factorial {
    public static void main(String[] args) {
        int num = 9, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of the number : " + fact);
    }
}
