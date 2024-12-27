import java.util.Scanner;

public class Fibonaci {
    static Scanner sc =new Scanner(System.in);
    static int i = 1;
    static long n1=0,n2=1,n3;
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i=1;
        System.out.print("Enter the range: ");
        int count= sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        fibo(count);
        System.out.println();
    }
    public static void fibo(int count)
    {
        if(i<=count-2)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            i++;
            fibo(count);
        }   
    }
}
