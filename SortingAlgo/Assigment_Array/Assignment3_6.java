import java.util.Arrays;
import java.util.Scanner;

public class Assignment3_6 
{    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        int[] a = {8, 4, -3, 16, 7, 12, 1};
        int[] b = {8, 16, 4, 3, 0, 2};
        boolean flag = true;
        
        while(flag){
            System.out.println("\n** *** * *****Select the input** * ******** ");
            System.out.println("1.Find the Number is present Or not\n2.Find the nth maximum number\n3.Exit ");
            System.out.print("Input    : ");
            int input = sc.nextInt();
            if(input>0 && input < 4){
                switch(input){
                    case 1 :{
                        System.out.print("Enter the number:");
                        int num = sc.nextInt();
                        String res = FindNum(a, num);
                        Thread.sleep(1000);
                        System.out.println("\n"+Arrays.toString(a));
                        System.out.println(num+" is "+ res);
                        Thread.sleep(3000);
                        break;
                    }
                    case 2 :{
                        System.out.print("Enter the number:");
                        int num = sc.nextInt();
                        int res = FindNthMax(b, num);
                        Thread.sleep(1000);
                        System.out.println("\n"+Arrays.toString(b));
                        System.out.println(res+" is a "+num+ " maximum value");
                        Thread.sleep(3000);
                        break;
                    }
                    case 3 :{
                        flag = false;
                        break;
                    }
                    default:{
                        System.out.println("wrong Selecion try again");
                    }
                }    
            }
            else{
                System.out.println("Wrong selection try again.....");
            }
        }
        System.out.println("Thank you...");
    }

    public static String FindNum(int[] a,int num)
    {
        boolean present = false;
        String res =" ";
        for(int i =0; i<a.length;i++)
        {
            if(a[i] == num){
                present = true;

            }
        }
        if(present)
            res ="Present";
        else 
            res = "Not Present";
        return res;
    }

    public static int FindNthMax(int[] b, int num)
    {   
       for(int i = 0 ;i<b.length-1; i++)
       {
            for(int j =0; j<b.length-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
    
       }
       return b[b.length-1-(num-1)];
    }
}
