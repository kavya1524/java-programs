package Array;

public class arrayodd {
    public static void main(String[] args) {

        int[] k = {1, 22, 32, 24, 54, 62, 7, 8};
        for (int i = 1; i< k.length; i++) {
            if (k[i]%2!=0)
                System.out.println(k[i]);
        }

    }   }