import java.util.Scanner;

public class Palindrom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");

        String str = sc.next();
        String org_str = str;

        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (org_str.equals(rev)) {
            System.out.println(org_str + " Is Palindrome");
        } else {
            System.out.println(org_str + " Not Palindrome");
        }
    }
}
