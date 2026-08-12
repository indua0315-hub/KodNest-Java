
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    double add(int a, double b, double c) {
        return a + b + c;
    }

    double add(double a, int b, double c) {
        return a + b + c;
    }

    double add(double a, double b, int c) {
        return a + b + c;
    }
}

public class addApp {

    public static void main(String[] args) {
        Addition al = new Addition();
        System.out.println(al.add(10, 20));
        System.out.println(al.add(10.5, 20.5));
        System.out.println(al.add(10, 5, 15));
        System.out.println(al.add(10.5, 20.5, 10.5));

    }

}
