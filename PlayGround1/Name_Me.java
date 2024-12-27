import java.util.Scanner;
public class Name_Me {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {   
        
        
        int n = 7;
        for(int i=0;i<n;i++)
        {   //V Letter
            for(int j=0; j<n;j++){
                if(i<=j-3 || i>=j+3 || i+j>=n+2 || i+j<=n-4 ){
                    System.out.print("  ");
                }
                else
                    System.out.print("* ");
            }
            System.out.print("  ");
            //2nd box
            // for(int j =0; j < n; j++)
            // {
            //     if(true) System.out.print("* ");
            //     else System.out.print("  "); 
            // }
            // System.out.print(" ");
            // //3rd box
            // for(int j =0; j < n; j++)
            // {
            //     if(true) System.out.print("* ");
            //     else System.out.print("  "); 
            // }
            // System.out.print(" ");
            // //4th box
            // for(int j =0; j < n; j++)
            // {
            //     if(true) System.out.print("* ");
            //     else System.out.print("  "); 
            // }
            // System.out.print(" ");
            // //5th box
            // for(int j =0; j < n; j++)
            // {
            //     if(true) System.out.print("* ");
            //     else System.out.print("  "); 
            // }
            System.out.println();
        }
        
        
    }
    static void function1(){

            int n = 7;
            for(int i = 0; i<n ;i++)
            {
               
                System.out.println();
            }
           
    }
}
