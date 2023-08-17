public class getithbit {
    public static void ith_bit(int i,int n){
        int bitmask= (1<<i);

if((n&bitmask)==0){
    System.out.println("the ith bit is 0");
}
else{
    System.out.println("the ith bit is 1");
}

    }
    public static void main(String[] args) {
      ith_bit(3, 10);  
    }
}
