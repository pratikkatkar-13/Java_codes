interface Printer {
    void print();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Printer p = new Printer() {
            public void print() {
                System.out.println("Printed from anonymous class");
            }
        };
        p.print();
    }
}

