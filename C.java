/*parametrized connstructor */
class C {
    int x, y; // instance variable declaration

    C(int a, int b) // parametrized
    {
        x = a;
        y = b;
    }

    C(int a, String b) {
        System.out.println(a + " " + b);
    }

    void show() {
        System.out.println(x + " " + y);
    }
}

class D {
    public static void main(String[] args) {
        C ref = new C(100, 200);
        C r = new C(10, "Priyanka");
        ref.show();
    }
}
