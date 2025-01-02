public class FindMaxProfit {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int profit =FindProfit(a);
        System.out.println(profit);

        int profit2 =FindProfit2(a);
        System.out.println(profit2);
    }
    //Aprouch 1
    public static int FindProfit(int[] a)
    {
        int n = a.length;
        int profit = Integer.MIN_VALUE;
        for(int i =0; i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                
                int max = a[j] - a[i];
                if(max>profit)
                    profit = max;

            }
        }
        return profit;
    }
    //Aproach 2
    public static int FindProfit2(int[] a)
    {
        int n = a.length;
        int buy = a[0];
        int max = Integer.MIN_VALUE;
        for(int i=1; i<n;i++)
        {
            int profit = a[i] - buy;
            buy = Math.min(buy, a[i]);
            max = Math.max(profit, max);
        }
        return max;
    }
}
