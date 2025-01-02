import java.util.Arrays;
class Pattern {
    public static void main(String[] args) {
        int n=5;
        pattern1(n);
     
    }
    //Pattern 1
    public static void pattern1(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                if(true)
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.println();
        }
    }    
}
