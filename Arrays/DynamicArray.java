import java.util.*;
public class DynamicArray {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Array size : ");
        int size = sc.nextInt();
        int [] res =array(size); 
        System.out.println(Arrays.toString(res));

        //another way to print array
        for(int i=0 ; i <res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
        System.err.println();
    }    

    public static int[] array(int size ) {
        int [] a = new int[size];
        System.out.print("Enter array elements : ");
        for(int i = 0; i < a.length; i++ )
        {
            a[i]= sc.nextInt();
           
        }
        System.out.print("\r");
        return a;
    }
}
