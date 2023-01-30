package Array;
class hm{
    public int multi(int ...arr){
        int m=1;
        for(int a:arr){
            m=m*a;
        }
        return m;
    }
}
public class forenhanceloopvm {
    public static void main(String[] args) {
        hm h=new hm();
        int mul=h.multi(5,4,2,2,2);
        System.out.println(mul);
    }
}

