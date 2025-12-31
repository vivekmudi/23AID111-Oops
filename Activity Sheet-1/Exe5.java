import java.util.Scanner;
class Exe5
{  public static void main(String[] arg)
   {   System.out.println("Enter the three numbers:");
       Scanner myObj = new Scanner(System.in);
       double a = myObj.nextDouble();
       double b = myObj.nextDouble();
       double c = myObj.nextDouble();
       double big;
       if(a>b&&a>c)
       {   big = a;
           System.out.printf("%.2f is greatest among three numbers",big);
       }   
       else 
       {
    	   if(b>c)
    	   {	  big = b;
                  System.out.printf("%.2f is greatest among three numbers",big);
    	   }
    	   else
    	   {    big = c;
                System.out.printf("%.2f is the greatest among three numbers",big);    		   
    	   }
       }
   }
}