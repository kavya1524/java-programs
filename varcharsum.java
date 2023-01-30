package Array;
class sum{
    public int add(int ...arr){
        int s=0;
        for (int i=0;i< arr.length;i++){
            s=s+arr[i];
        }
        return s;
    }
}
public class varcharsum {
    public static void main(String[]args){
        sum a=new sum();
        int addi=a.add(15,24,21,20,28);
        System.out.println(addi);
    }
}
