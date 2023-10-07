public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String str = " Java    programming    with   ME";

        System.out.println("Before removing whitespace: " + str);
        str = str.replaceAll("\\s", "");
        System.out.println("After removing whitespace: " + str);
    }
}
