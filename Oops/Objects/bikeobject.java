class bikeobject {
    // @SuppressWarnings("static-access")
    static Bike bike1 = new Bike();
    static Bike bike2 = new Bike();
    static Bike bike3 = new Bike();
    public static void main(String[] args) {
        

        bike1.carDetails();
        System.out.println("bike one name is "+bike1.bikename);
        System.out.println("bike one name is "+bike2.bikename);
        System.out.println("\n");
        System.out.println("Bike @1");
        bike1.run();
        bike1.acselarete();
        bike1.changeGear();
        bike1.stop();
        {
            if(bike1.bikename != null)
            {
                System.out.println(bike1.bikename+" is perfect");
            }
            else{
                System.out.println(bike1.bikename+" is not perfect");
            }
        }
        
        System.out.println("Bike owner is  : "+bike1.owner);
        System.out.println("\n");
        System.out.println("Bike @2");
        bike2.run();
        bike2.acselarete();
        bike2.changeGear();
        bike2.stop();
        {
            if(bike2.bikename != null)
            {
                System.out.println(bike2.bikename+" is perfect");
            }
            else{
                System.out.println(bike2.bikename+" is not perfect");
            }
        }
        System.out.println("Bike owner is  : "+bike1.owner);
    }
    {
        if(bike1.bikename != null)
        {
            System.out.println(bike1.bikename+" is perfect");
        }
    }


    
}
