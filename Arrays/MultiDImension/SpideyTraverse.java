import java.util.Arrays;

public class SpideyTraverse {
    public static void main(String[] args)
    {
        int[][] a= new int[5][5];
        System.out.println("Creating a array in spiral way....");
        spidy(a);
        System.out.println("print the array in spiral traverse...");
        System.out.println("*****************************************");
        Spideytraverse(a);
    }
    public static void spidy(int[][]a){
        int left=0,right =a.length-1 ;
        int top =0,bottom=a.length-1;
        int value =1;
        while(left<=right && top<=bottom)
        {
            // Left to right
            for(int i = left;i<=right;i++){
                a[top][i] = value++;
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                a[i][right] = value++;
            }
            right--;

            for(int i=right;i>=left;i--)
            {
                a[bottom][i] =value++;
            }
            bottom--;

            for(int i=bottom;i>=top;i--)
            {
                a[i][left] = value++;
            }
            left++;

            
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==0){
                   System.out.print(a[i][j]+"  ");
                }
                else
                   System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(a));
        System.out.println();
        System.out.println();
    }

    public static void Spideytraverse(int[][]a){
        int left =0,right=a.length-1;
        int top =0,bottom=a.length-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;

            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;

            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;

            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
        }
        System.out.println();

        
    }
}
