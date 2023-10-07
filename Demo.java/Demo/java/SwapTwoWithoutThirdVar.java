public class SwapTwoWithoutThirdVar {
    public static void main(String[] args) {
        int n1 = 20, n2 = 30;
        System.out.println("Before Swap :" + n1 + " ," + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After Swap :" + n1 + " ," + n2);
    }
}
