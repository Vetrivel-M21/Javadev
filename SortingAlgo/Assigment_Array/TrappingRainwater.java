import java.util.Arrays;
public class TrappingRainwater {
    public static void main(String[] args) {
        int[] a = {4, 2, 0, 6, 3 ,2 ,5};
        System.out.println(Arrays.toString(a));

        int max = Findmax(a);
        // System.out.println(max);

        int[] left = leftpart(a, max);
        System.out.println(Arrays.toString(left));

        int[] right = rightpart(a, max);
        System.out.println(Arrays.toString(right));

        int water = findWater(left, right);
        System.out.println("this building hold "+water+" this level of water");
    }


    //find max
    public static int Findmax(int[] a)
    {
        int max = 0;
        for(int i = 0; i < a.length-1; i++)
        {
            if(a[max] < a[i]){
                max = i;
            }
        }
        return max;

    }

    public static int[] leftpart(int[] a, int max)
    {
        int [] left = new int[max+1];
        for(int i=0 ; i<=max; i++)
        {
            left[i] = a[i];
        }
        return left;
    }

    public static int[] rightpart(int[] a, int max)
    {
        int[] right = new int[a.length-max];
        for(int i = 0; i<right.length;i++)
        {
            right[i] = a[max+i];
        }
        // System.out.println(right.length);
        return right;
    }
    public static int findWater(int[] left, int[] right) {
        int water =0;
        
        int left_square = left[0] * (left.length-2);
        int left_sum = 0;
        for(int i=1; i<left.length-1; i++)
        {
            left_sum += left[i];
        }
        int leftwater = left_square - left_sum;

        int right_square = right[right.length-1] * (right.length-2);
        int right_sum = 0;
        for(int i=1; i<right.length-1; i++)
        {
            right_sum += right[i];
        }
        int right_water = right_square -right_sum;
        water = right_water+leftwater;
        

        return water;
    }
}
