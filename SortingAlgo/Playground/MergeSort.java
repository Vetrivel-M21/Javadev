import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {6, 1, 3, 2};
        devide(0,a.length-1 , a);
        System.out.println(Arrays.toString(a));
    }

    public static void devide(int low, int high, int[] a)
    {
        if(low == high){
            return;
        }
        int mid = (low+high)/2;
        //right array
        devide(low, mid, a);
        //left Array
        devide(mid+1, high, a);
        //merge sort
        mergesort(low, mid, high, a);
    }

    public static void mergesort(int low, int  mid, int high, int[] a)
    {
        int left = low, right = mid + 1;
        int[] temp = new int[a.length];

        int k = 0;
        while(left<=mid && right <= high)
        {
            if(a[left]<a[right])
            {
                temp[k++] = a[left++];
            }
            else{
                temp[k++] = a[right++];
            }
        }

        while(left <= mid){
            temp[k++] = a[left++];
        }
        while(right <= high){
            temp[k++] = a[right++];
        }
        int m =0;
        for(int i =low; i<=high; i++,m++)
        {
            a[i] = temp[m];
        }
        // System.out.println(Arrays.toString(temp));
        

    }
}
