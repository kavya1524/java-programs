package Kavya;
class manu{
    int cylinder,radius;
    double volume;
    public void  set(int ra1,int ra2,int r,int h){
        this.cylinder=ra1*ra2*r*h;
    }
    public double get() {
        volume = 3.14*cylinder;
        return volume;
    }
}
public class sgm {
    public static void main(String[]args){
        manu m=new manu();
        m.set(2,3,4,5);
        System.out.println(m.get());
    }

}
