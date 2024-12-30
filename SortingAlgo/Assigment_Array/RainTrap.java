import java.util.Arrays;
public class RainTrap {

    public static void main(String[] args) {
        // int [] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[][] testCases = {
            {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, // Expected: 6
            {4, 2, 0, 3, 2, 5},                   // Expected: 9
            {1, 0, 2},                            // Expected: 1
            {5, 4, 3, 2, 1},                      // Expected: 0
            {2, 0, 2},                            // Expected: 2
            {},                                   // Expected: 0
            {3},                                  // Expected: 0
            {1, 1, 1, 1}                          // Expected: 0
        };
    
        for (int i = 0; i < testCases.length; i++) {
            int[] a = testCases[i];
            // int water = findWater(a);
            int unit = trap(a);
             System.out.println("Test Case " + (i + 1) + ": " + Arrays.toString(a));
            System.out.println("Trapped water: " + unit + " units\n");
        }
    
    }
    public static int findWater(int[] a)
    {
        if(a.length <=2 || a ==null ){
            return 0;
        }
        int[] water =new int[a.length];
        int units=0;
        int n = a.length;
        int [] left = new int[n];
        int [] right = new int[n];

          //     {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
          // {0, 0, }
        left[0]=a[0];
        for(int i = 1; i< n; i++){
            if(left[i-1]>a[i])
            {
                left[i] = left[i-1];
            }
            else{
                left[i] = a[i];
            }

        }
        // [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
        right[n-1] = a[n-1];
        for(int i= n-2; i>=0;i--){
            if(right[i+1]>a[i]){
                right[i] =right[i+1];

            }
            else{
                right[i]= a[i];
            }
        } 
        // System.out.println(Arrays.toString(right));
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(a));
        
        // int[] rightmax = new int[n];

        // System.out.println(Arrays.toString(rightmax));
        
        for(int i =0 ; i<a.length;i++)
        {
            if( left[i] > right[i]){
                water[i] = right[i];
            }
            else{
                water[i] = left[i];
            }
        }
        // System.out.println(Arrays.toString(water));

        for(int i =0; i<a.length;i++)
        {
            water[i]=water[i]-a[i];
            units +=water[i];
        }
        // System.out.println(Arrays.toString(water));

        return units;
    }

    public static int trap(int[] a)
    {
        int unit =0;
        int[] left = new int[a.length];
        int[] right = new int[a.length];


        left[0]= a[0];
        for(int i=1; i<a.length;i++)
        {
            left[i] = Math.max(left[i-1], a[i]);
        }

        right[a.length-1] = a[a.length-1];
        for(int i = a.length-2 ; i>=0 ;i--)
        {
            right[i] = Math.max(right[i+1], a[i]);
        }

        for(int i=0; i<a.length;i++)
        {
            unit += Math.min(left[i], right[i])-a[i];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return unit;
    }

    
}
