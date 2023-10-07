public class ReverseAString {
    public static void main(String[] args) {
        String s = "Java";
        String revs = "";

        System.out.println("Length of the string is " + s.length());

        for (int i = s.length() - 1; i >= 0; i--) {
            revs = revs + s.charAt(i);
        }
        System.out.println("Reverse string is " + revs);
    }
}
