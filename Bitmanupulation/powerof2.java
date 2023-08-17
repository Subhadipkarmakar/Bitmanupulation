public class powerof2 {
    public static void ispowerof2(int n){
        if((n&(n-1))==0){
            System.out.println("this is power of 2");
        }
        else{
            System.out.println("this is not a power of 2");
        }
    } 
    public static void main(String[] args) {
       ispowerof2(15); 
    }
}
