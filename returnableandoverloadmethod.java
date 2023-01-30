package Kavya;

public class returnableandoverloadmethod {
    public static int k(int a,int b){
    int c=a+b;
    return c;
    }
    public static int k(int a,int b,int g){
        int h=a+b+g;
        return h;
    }
    public static int v(int a,int b){
        int d=a-b;
        return d;
    }
    public static boolean y(int a,int b){
        int e=a=b;
        return true;
    }
    public static void main(String[] args) {
        int i=k(24,15);
        int o=k(2,24,25);
        int j=v(24,15);
        boolean l=y(6,6);

        System.out.println(i);
        System.out.println(o);
        System.out.println(j);
        System.out.println(l);
    }
}

