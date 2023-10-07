public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s1 = "Learn Java";
        // String s2 = "";
        // System.out.println("Length of the string is " + s1.length());
        // for (int i = 0; i < s1.length(); i++) {
        // if (s1.charAt(i) != ' ') {
        // s2 = s2 + s1.charAt(i);
        // }
        // }
        // System.out.println("String without white space " + s2);

        s1 = s1.replaceAll("\\s+", "");
        System.out.println("String without white space " + s1);
    }
}
