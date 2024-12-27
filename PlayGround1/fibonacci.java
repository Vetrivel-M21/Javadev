import java.util.Scanner;
public class fibonacci {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the limit : ");
        int series = sc.nextInt();
        long n1 =0l , n2 = 1l, n3 =0l;
        System.out.print(n1+" "+n2+" ");
        for(int i = 1 ;i <= series;i++)
        {
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
        
        
    }
    
}
