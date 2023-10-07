public class Palindro1 {
    public static void main(String[] args) {
        int num = 12321;
        int init = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("Reverse Number is: " + rev);
        if (rev == init) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

}
