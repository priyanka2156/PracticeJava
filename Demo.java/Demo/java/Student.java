class Student {
    int roll, marks;
    String name;

    void input() {
        System.out.println("Enter roll name & marks: ");
    }
}

class priyanka extends Student {
    void disp() {
        roll = 1;
        name = "Priyanka";
        marks = 88;
        System.out.println(roll + " " + name + " " + marks);
    }

    public static void main(String[] args) {
        priyanka r = new priyanka();
        r.input();
        r.disp();
    }
}
