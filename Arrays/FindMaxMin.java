import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        int [] a = {5, 3, 8, 2, 6, -1, 7, 9, 1};
        minmax(a);
    }
    
    public static void minmax(int[] x) {
       int min = x[0], max = x[0];

       for(int i = 0;i < x.length; i++ )
       {
            if(max<x[i])
            {
                max = x[i];
            }
            else if(min > x[i])
            {
                min = x[i]; 
            }
           
       }
       System.out.println("Minimum value is : "+min);
       System.out.println("Maximum value is : "+max);


    }
}
