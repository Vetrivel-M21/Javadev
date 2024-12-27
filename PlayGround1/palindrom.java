

public class palindrom {
    
    public static void main(String[] args) {
        int num = 23432, reverse =0 , temp = num;

        while(num >0)
        {
            reverse = reverse*10 + num % 10;
            num /= 10;
        }
        if (reverse == temp){
            System.out.println(temp+" its a Palindrom Number");

        }
        else{
            System.out.println(temp+"not a plaindrom");
        }
    }
}
