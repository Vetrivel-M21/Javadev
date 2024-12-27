

public class factorial {
    public static void main(String[] args) {
        int num = 14;
        long fact=1l;
        for(int i=2;i<=num;i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
        
    }
}
