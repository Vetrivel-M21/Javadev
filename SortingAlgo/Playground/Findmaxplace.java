public class Findmaxplace {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int maxArea =FindArea(a);

        System.out.println(maxArea);

    }

    public static int FindArea(int[] a)
    {
        // {1,12,3,5,6,11,3,6,10};
        int maxArea = Integer.MIN_VALUE ;
        int n = a.length;
        int l=0,r= n-1;
        while(l<r)
        {
            int ln = Math.min(a[l], a[r]);
            int b = r-l;
            int area =ln * b;
            maxArea = Math.max(area, maxArea);
            if(a[l]>a[r]){
                r--;
            }
            else l++;
        }

        return maxArea;
    }
    
}
