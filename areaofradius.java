package Kavya;
class siddu{
    int radius,square,rectangle,length,width;

    public double k(int r){
        this.radius =r;
        return 3.14*radius*radius;
    }
    public double l(int p){
        this.square=p;
        return square*square;
    }
    public double o(int q, int f){
        this.length=q;
        this.width=f;
        return length*width;
    }
}
public class areaofradius {
    public static void main(String[]args){
        siddu s=new siddu();
        System.out.println(s.k(24));
        System.out.println(s.l(15));
        System.out.println(s.o(24,15));
    }
}
