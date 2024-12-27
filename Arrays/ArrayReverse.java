import java.util.Arrays;

public class ArrayReverse {
    
    public static void main(String[] args) {
        int [] a = {12, 34, 43, 55, 9, 46};
        System.out.println(Arrays.toString(a));
        System.out.println("*********** method 1 **************");
        //method 1
        int [] res= Reverse(a);
        System.out.println("result1 ="+Arrays.toString(res));
        System.out.println("*********** method 2 **************");

        
        //method 2
       
        int [] res2= Reverse2(a);     
        System.out.println("result2 ="+Arrays.toString(res2));
        
        
        
        
    }
    
    public static int[] Reverse(int [] x) {
       
        int i= 0;
        int right = x.length-1, left = 0;
         while(left<right)
         {
            int temp = x[left];
            x[left]  = x[right];
            x[right] = temp;
            left++;
            right--;
            i++;
            
         }
         return x;
        
    }

    public static int[] Reverse2(int [] x) {
       
    
        int [] b = new int[x.length];
        int m = 0;
        for(int i =x.length-1; i>=0; i--, m++)
        {
            b[m] = x[i];
        }
        
         
         return b;
        
    }
    
}
