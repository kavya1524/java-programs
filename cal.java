package Kavya;

public class cal {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
    public void mul(int a, int b){
        System.out.println(a*b);
    }
    public void div(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        cal i =new cal();
        i.add(24,15);
        cal j =new cal();
        j.sub(24,15);
        cal k =new cal();
        k.mul(24,15);
        cal l =new cal();
        l.div(24,15);
    }
}
