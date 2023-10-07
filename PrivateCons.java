public class PrivateCons {
    int a;
    double b;
    String c;

    private PrivateCons() {
        a = 20;
        b = 32.98;
        c = "priyanka";
        System.out.println(a + " " + b + " " + c + " ");
    }

    static void show() {

    }

    public static void main(String[] args) {
        PrivateCons r = new PrivateCons();
    }
}
