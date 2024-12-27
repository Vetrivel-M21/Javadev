import java.util.*;

class zomzto {
    static Scanner sc = new Scanner(System.in);
    static Random rend = new Random();    
    String Hotel;

    public static void main(String[] args) {
        hotel_selection();
        
    }

    public static void hotel_selection(){
        System.out.println("Select the Hotel..");
        System.out.println("1.Bilall\n2.Bhuhari\n3.AmmaUnavagam\n4.A2B");
        System.out.print("Enter the Hotel Name :");
        String Hotel = sc.next();
       Food_selection(Hotel);
        
    }

    public static void Food_selection(String Hotel)
    {
        
        String Hotel1 = "bilall";
        String Hotel2 = "bhuhari";
        String Hotel3 = "ammaunavagam";
        String Hotel4 = "a2b";
        if(Hotel.equalsIgnoreCase(Hotel1) || Hotel.equalsIgnoreCase(Hotel2)  || Hotel.equalsIgnoreCase(Hotel3)  || Hotel.equalsIgnoreCase(Hotel4)  )
        {        System.out.println("Welcome to "+Hotel+".....\nAvailable Food here....");
                System.out.println("+------------------------------------+");
                System.out.println("| 1.Chicken-65           - Rs.120    |");
                System.out.println("+------------------------------------+");
                System.out.println("| 2.Chicken-Biriyani     - Rs.120    |");
                System.out.println("+------------------------------------+");
                System.out.println("| 3.Mutton-Biriyani      - Rs.120    |");
                System.out.println("+------------------------------------+");
                System.out.println("| 4.Curd-Rice            - Rs.120    |");
                System.out.println("+------------------------------------+");
                System.out.print("Enter the food Name:");
                String Food = sc.next();
                switch (Food.toLowerCase()) {
                    case "chicken-65" : {
                        System.out.print("How Much Quantity you want :");
                        int Quantity = sc.nextInt();
                        
                        break;
                    }
                
                    default:
                        System.out.println("Invalid Food Selection.");
                        break;
                }
               
            }else{
                System.out.println("Ivalid Hotel Selection");
            }
        
    }
}

