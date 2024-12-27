class Demo2
{
    public static void main(String[]args)
    {
         
        String skill = "php";
        double a = 23.38;
        boolean c, d = false, e = true; 
        System.out.println(skill);  
        System.out.println(a);      
        skill = "java";
        System.out.println(skill);  
        skill = "php, java";
        System.out.println(skill);   
        a = 65.89;
        System.out.println(a);     
        System.out.println("d: " + d);  
        System.out.println("e: " + e);  
        d = e;  
        e = d;  
        System.out.println("d: " + d);  
        System.out.println("e: " + e);  
    }
}