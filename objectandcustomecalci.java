package Kavya;
class hp{
    public void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    public  void sub(int n1,int n2){
        System.out.println(n1-n2);
    }
    public  void mul(int n1,int n2){
        System.out.println(n1*n2);
    }
    public void div(int n1,int n2){
        System.out.println(n1/n2);
    }
}
public class objectandcustomecalci {
    public static void main(String[] args) {
        hp k=new hp();
        k.add(24,15);
        k.sub(24,15);
        k.mul(24,15);
        k.div(24,15);

    }
}
