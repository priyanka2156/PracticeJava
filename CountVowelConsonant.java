public class CountVowelConsonant {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0;

        String str = "Today we will learn simple java here";
        str = str.toLowerCase();
        System.out.println("string in lower case " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Count of vowels " + vCount);
        System.out.println("Count of consonants " + cCount);

    }
}
