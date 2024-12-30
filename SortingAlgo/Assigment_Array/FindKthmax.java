import java.util.Scanner;
import java.util.Arrays;

class FindKthmax{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {3,4,2,5,6,7,5,4,2,5,6,7,5,99,8,77};
        System.out.print("Enter the Key : ");
        int k = sc.nextInt();
        int max = findmax(a,k);
        System.out.println(max);
        System.out.println(Arrays.toString(a));
    }

    public static int findmax(int[] a,int k){
        int max = Integer.MIN_VALUE;
        for(int m =1; m<=k;m++)
        {   max =0;
            for(int i=0; i<a.length;i++)
        {
            if(a[i]>max)
            {
                max =a[i];
            }
        }

        for(int i=0; i<a.length; i++)
        {
            if(max==a[i])
            {
                a[i]= Integer.MIN_VALUE;
            }
        }

        }
        return max;

    }
}