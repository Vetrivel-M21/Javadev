import java.util.*;
class Discount {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Enter the Quantity of  Product :");
        int Quantity = sc.nextInt();
        System.out.print("Enter the price of Product :");
        double Price = sc.nextDouble();

        if(Quantity>=100){
            double Actual_Price = Quantity * Price;
            double Discount_Price = Actual_Price + Actual_Price * 10/100;
            
            System.out.println("Total Price "+Quantity+" x "+Price+" Pluss 10% discount :"+Discount_Price);

        }
        else if(Quantity<100){
            double Actual_Price = Quantity * Price;
            System.out.println("Total Price "+Quantity+" x "+Price+" :"+Actual_Price);
        }
        else{
            System.out.println("Invalid");

        }

    }
}
