public class clearrangeofbits {
    public static int crb(int n,int i,int j){
        int a=-1<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(crb(10,2 ,4 ));
    }
}
