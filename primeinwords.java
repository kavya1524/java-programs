package loops;

public class primeinwords {
    public static void main(String[] args) {
        int num=15;
        int count=0;
        for(int i=1;i<=num/2;i++){
            if ((num%i==0))
            count++;
        }
        if (count>1){
            System.out.println("not prime number");
        }
        else {
            System.out.println(" prime number");
        }
    }
}
