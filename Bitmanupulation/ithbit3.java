public class ithbit3 {
    public static int clearithbit (int n,int i){
int bitmask=~(1<<i);
return n&bitmask;
    }
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n |bitmask;
    }
    // public static int updateithbit(int n,int i,int newbit){
    //     if(newbit==0){
    //         return clearithbit(n, i);
    //     }
    //     else{
    //         return setithbit(n, i);
    //     }
    // }


    //another method to do the update ith bit is 

    public static int updateithbit(int n,int i,int newbit){
  n= clearithbit(n, i);
  int bitmask=(newbit<<i);
  return n| bitmask;
    }

    public static void main(String[] args) {
       // System.out.println(clearithbit(10,1 ));
       System.out.println(updateithbit(10, 2, 1));
    }
}
