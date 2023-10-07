//Copy constructor
class D {
    int a;
    String b;

    D() {
        a = 10;
        b = "Hello";
        System.err.println(a + " " + b);
    }

    D(D ref) {
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
}

class E {
    public static void main(String[] args) {
        D r = new D();
        D r2 = new D(r);
    }
}
