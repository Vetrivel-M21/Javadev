import java.util.*;

public class ArrayRotation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] a = { 2, 3, 4, 1, 7 };
        System.out.println(Arrays.toString(a));

        System.out.print("Enter the no.of Rotation : ");
        int num = sc.nextInt();

        int [] res = Rotation(a, num);
        System.out.println(Arrays.toString(res));

    }

    public static int[] Rotation(int [] x, int num)
    {
        for(int i = 1; i <= num; i++){
            int first = x[0];

            for(int j =0 ; j < x.length-1; j++)
            {
                x[j] = x[j+1];
            }

            x[x.length-1] = first;
        }
        return x;
    }
}
