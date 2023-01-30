package Array;

public class arrayeven {
    public static void main(String[] args) {
        int[] k ={15, 2, 3, 24, 5,62,7,8};
        for (int i=1;i<k.length;i++) {
            if (k[i]%2==0)
            System.out.println(k[i]);
        }
    }
}