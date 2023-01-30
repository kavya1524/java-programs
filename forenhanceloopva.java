package Array;
class ph{
    public int add(int ...arr){
        int s=0;
        for (int a:arr){
            s=s+a;
        }
        return s;
    }
}
public class forenhanceloopva {
    public static void main(String[]args){
        sum a=new sum();
        int addi=a.add(15,24,21,20,28);
        System.out.println(addi);
    }
}

