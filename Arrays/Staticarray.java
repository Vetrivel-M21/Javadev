
import java.util.Arrays;
public class Staticarray {
    
    public static void main(String[] args) {
        int [] a={23, 45, 65, 98, 24, 9, 12};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
