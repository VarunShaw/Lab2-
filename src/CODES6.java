class SubtractDemo {

    void subtract(int a, int b) {
        System.out.println(a - b);
    }

    void subtract(int a, int b, int c) {
        System.out.println(a - b - c);
    }

    void subtract(double a, double b) {
        System.out.println(a - b);
    }
}

public class CODES6 {
    public static void main(String[] args) {

        SubtractDemo obj = new SubtractDemo();

        obj.subtract(20, 10);
        obj.subtract(50, 20, 5);
        obj.subtract(25.5, 10.2);
    }
}
