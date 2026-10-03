import java.util.Scanner;
class IfElse
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("water consumptiom in liters") ;
        int liters=sc.nextInt();

         if (liters <= 500)
        {
            
            System.out.println("the bill is 100");
        }
        else
        {
            System.out.println("the bill is 200");
            
        }

          

        
    }
}

    

