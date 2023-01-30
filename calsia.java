package Kavya;
public class calsia {
    public int add(int a, int b) {
        int x = a + b;
        return x;
    }
    public int sub(int a, int b) {
        int x = a - b;
        return x;
    }
    public int mul(int a, int b) {
        int x = a * b;
        return x;
    }
    public int div(int a, int b) {
        int x = a / b;
        return x;
    }

    public static void main(String[] args) {
        calsia s = new calsia();
        s.add(24, 15);
        System.out.println(s.add(24, 15));
        s.sub(24, 15);
        System.out.println(s.sub(24, 15));
        s.mul(24, 15);
        System.out.println(s.mul(24, 15));
        s.div(24, 15);
        System.out.println(s.div(24, 15));

    }
}