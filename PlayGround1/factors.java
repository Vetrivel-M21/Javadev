

public class factors {
    public static void main(String[] args) {
        int num = 21, fact = 0;

        for(int i=1; i <= num/2; i++)
        {
            if(num % i ==0 )
            {
                 System.out.println("Factors : "+i);
                

            }
        }
    }
    
}
