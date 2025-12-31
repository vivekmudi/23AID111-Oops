import java.util.Scanner;
class Exe2
{   public static void main(String[] arg)
	{   System.out.println("Enter a Number: ");
	    Scanner myObj = new Scanner(System.in);
	    double n = myObj.nextDouble();
	    if(n>0)
	    {
	    	System.out.println("Given Number is Positive");
	    }
	    else
	    {
	    	if(n<0)
	          System.out.println("Given Number is  Negative");
	        else 
	          System.out.println("Given Number is Zero");
	    }
	}
}
