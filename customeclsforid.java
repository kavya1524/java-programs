package Kavya;
class hpk {
    int id;
    String srt;
    public void  k() {
        System.out.println("my id is:" + "\t" + id + "\n" + "my name is:" + "\t" + srt);
    }
    public int j(int a,int b){
        int e=a+b;
        return e;
    }
}
    public class customeclsforid {

        public static void main(String[] args) {
            hpk m = new hpk();
            m.id = 24; m.srt = "kavyashreehp";
            m.k();
            System.out.println("my new id is:"+"\t" + m.j(m.id,1));
        }
    }
