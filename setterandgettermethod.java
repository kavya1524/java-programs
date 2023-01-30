package Kavya;
class sid{
int radius,height;
double volume;


        public void  set(int r,int h ){
            this.radius=r;
            this.height=h;
        }
        public double get() {
            volume = 3.14 * radius*radius*height;
            return volume;
        }
}
public class setterandgettermethod {
    public static void main(String[] args) {
        sid s = new sid();
        s.set(4,6);
        System.out.println(s.get());

    }
}
