public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, sum, count = 10;
        System.out.print(n1 + "," + n2);
        for (int i = 0; i < count; i++) {
            sum = n1 + n2;
            System.err.print("," + sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
