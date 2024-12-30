import java.util.Arrays;

class MinToMax{
    public static void main(String[] args) {
        int[] a= {3, 4, -6, 2, -7 ,2, -2, 7};
        int l =0, r=a.length-1;

        while(l<r)
        {
            if(a[l] >0 && a[r]<0)
            {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                r--;
                l++;
            }

            if(a[l]<0)
            {
                l++;
            }

            if(a[r]>0){
                r--;
            }

            
        }
        System.out.println(Arrays.toString(a));
    }
}