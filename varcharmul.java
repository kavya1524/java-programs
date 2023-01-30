package Array;
class hema{
    public int multi(int ...arr){
        int m=1;
        for(int i=0;i<arr.length;i++){
            m=m*arr[i];
        }
        return m;
    }
}
public class varcharmul {
    public static void main(String[] args) {
        hema h=new hema();
        int mul=h.multi(5,4,2,2,2);
        System.out.println(mul);
    }
}
