import java.util.*;

class EbBill {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double unit5 = 0.5;
        double unit15 = 0.75;
        double unit25 = 1.20;
        double unit30 = 1.50;
        System.out.print("Enter the UNIT :");
        double input = sc.nextDouble();
        if(input >0){

        if(input > 0 && input <=50)
        {
            double price = (input*unit5) + (input * unit5 * 20/100);
            System.out.println("Electric Bill RS."+price);
        } 
        else if(input > 50 && input <=150)
        {
            double price = (input*unit15) + (input * unit15 * 20/100);
            System.out.println("Electric Bill RS."+price);
        } 
        else if(input > 150 && input <=250)
        {
            double price = (input*unit25) + (input * unit25 * 20/100);
            System.out.println("Electric Bill RS."+price);
        } 
        else if(input > 250)
        {
            double price = (input*unit30) + (input * unit30 * 20/100);
            System.out.println("Electric Bill RS."+price);
        } 
        
    }
    else{
        System.out.println("Invalid");
    }
    }
}
