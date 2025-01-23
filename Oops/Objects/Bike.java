import java.util.Scanner;

class Bike {
    static Scanner sc =new Scanner(System.in);
    String bikename ,color;
    static String owner="Goku" ;
    Double price;
    public static void main(String[] args) {
        
    }

    public void run()
    {
        System.out.println(bikename+" bike is perfectly run");
    }

    public void changeGear(){
        System.out.println(bikename+" Bike gear changed");
    }
    
    public void acselarete(){
        System.out.println(bikename+" is start to Acselarate");
    }

    public void stop(){
        System.out.println(bikename+" bike is stoped");
    }

    public void carDetails()
    {
        System.out.print("Car Name :");
        bikename = sc.nextLine();
        System.out.print("Car color :");
        color = sc.nextLine();
        System.out.print("Car Price :");
        price = sc.nextDouble();
       
    }
}
