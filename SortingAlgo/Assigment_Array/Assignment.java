import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("\n---------***Assignment-1***---------");
        System.out.println("\n--------Character to intiger---------");
        char[] Ch = {'A', 'B', 'C', 'D'};
        for(int i= 0; i<Ch.length;i++)
        {
            System.out.print(Ch[i]+" ");
        }
        System.out.println();
        PrintCharTonum(Ch);
        System.out.println();

        System.out.println("\n---------***Assignment-2***---------");
        System.out.println("\n-------sum of even  numbers---------");
        int [] a ={6,4,3,2,1,7};
        int sum = SumOfEven(a);
        System.out.println(": "+sum);

        System.out.println("\n---------***Assignment-4***---------");
        System.out.println("\n-------sum of prime  numbers---------");
        int [] b ={2, 1,0, 3, 5, 4, 6 ,7};
        int prime_sum = SumOfPrime(b);
        System.out.println(": "+prime_sum);

        System.out.println("\n---------***Assignment-5***---------");
        System.out.println("\n-------sort the array---------");
        int [] c ={0,1, 1, 0, 1, 1 ,0,0};
        System.out.println(Arrays.toString(c));
        Sort(c);
        System.out.println(Arrays.toString(c));
    }

    //Assignment 1
    public static void PrintCharTonum(char[] a)
    {
        for(int i =0; i<a.length; i++)
        {
            System.out.print((int)(a[i])+" ");
        } 
        
    }

    //Assignment 2
    public static int SumOfEven(int[] a)
    {
        int sum =0;
        System.out.println(Arrays.toString(a));
        for(int i =0; i<a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" + ");
                sum +=a[i];
            }
        }
        return sum;
    }
    
    //Assignment 4 in prime finder

    public static boolean Prime(int a)
    {
        boolean prime = false; 
        int j =0;
        for(int i=1; i <= a; i++)
        {
            if( a != 1 && a != 0 && a % i ==0){
               j++;
            }
        }
        if(j == 2){
            prime = true;
        }
      
        return prime;
    }
    //Assignment 4
    public static int SumOfPrime(int [] b)
    {
        System.out.println(Arrays.toString(b));
        int prime_sum =0;
        for(int i =0; i<b.length; i++)
        {
            if(Prime(b[i])){
                System.out.print(" + "+b[i]);
                prime_sum += b[i];
            }
        }
        return prime_sum;
    }
    //Assignment 5
    public static void Sort(int[] c)
    {   int max =0;
        for(int i=0; i<c.length;i++){
            if(c[i]>max){
                max = c[i];
            }
        }
        int[] res = new int[max+1];
        for(int j=0; j<c.length;j++)
        {
            res[c[j]]++;
        }
        int j=0;
        for(int i =0; i<res.length; i++)
        {   
            
            while(res[i]>0){
                
                c[j] = i;
                j++;
                res[i]--;
                
            }
        } 
        
    }
}
