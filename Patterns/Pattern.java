import java.util.Arrays;
class Pattern {
    public static void main(String[] args) {
        int n=5;
    
        System.out.println("    ");
        pattern3(n);
     
     
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
    
    public static void pattern2(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<n)
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.println();
        }
    }   
    
    public static void pattern3(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n-i;j++)
            {
                System.out.print("&");
            }
            System.out.println();
        }
    } 

    public static void pattern4(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                if(i >= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i =1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i >= j)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i)
                    System.out.print(i);
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
 
    public static void pattern8(int n)
    {
        for(int i =0; i<n;i++)
        {
            for(int j = 0;j < n; j++)
            {
                if(i+j <n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
     
    public static void pattern9(int n)
    {
        for(int i =0; i<=n; i++)
        {
            for(int j =1 ;j<=n;j++)
            {
                if(i+j<=n)
                    System.out.print(j);
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n)
    {
        for(int i = 0; i < n;i++)
        {
            for(int j =0; j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j =0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
