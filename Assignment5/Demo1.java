class test2
{
    public static void main(String []args)
    {
        with_temp();
        System.out.println("       ");
        without_temp();
        System.out.println("       ");
        without_temp2();
        System.out.println("       ");
        


    }
     
    static void with_temp()
    {
        System.out.println("***Swap Using temprory variable**");
        int a =60, b=30, c=20;
        int temp;
        System.out.println("+-------------------------------+");
        System.out.println("| A :"+a+"  B :"+b+" c :"+c +"\t\t|");
        temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.println("+-------------------------------+");
        System.out.println("| A :"+a+"  B :"+b+" c :"+c +"\t\t|");
        System.out.println("+-------------------------------+");

    }

    static void without_temp()
    {
        System.out.println("***Swap Without Using Temprory Varoable**");
        int a =60, b=30, c=20;
        System.out.println("+---------------------------------------+");
        System.out.println("| A :"+a+"  B :"+b+" c :"+c +"\t\t\t|");

        a = a + b + c; //60+30+20 
        b = a - (b + c); // 110 - (30+20)
        c = a - (b + c); // 110 - (60+20)
        a = a - (b + c); // 110 - (60+30)
        System.out.println("+---------------------------------------+");
        System.out.println("| A :"+a+"  B :"+b+" c :"+c +"\t\t\t|");
        System.out.println("+---------------------------------------+");



    }
    static void without_temp2()
    {
        System.out.println("\n***Swap  4 numbers Without Using Temprory Varoable**");
        int a =60, b=30, c=20, d =45;
        System.out.println("+---------------------------------------+");
        System.out.println("| A :"+a+"  B :"+b+" c :"+c +" D :"+d+"\t\t|");
        //swap A and B 
        a = a + b;
        b = a - b;
        a = a - b;

        //swap B and c 
        b = b + c;
        c = b - c;
        b = b - c;

        //swap c and d 
        c = c + d;
        d = c - d;
        c = c - d;
        
        System.out.println("+---------------------------------------+");
        System.out.println("| A :"+a+"  B :"+b+" c :"+c +" D :"+d+"\t\t|");
        System.out.println("+---------------------------------------+");



    }


}