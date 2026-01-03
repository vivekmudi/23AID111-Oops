import java.util.Scanner;
class Exe3
{   public static void main(String[] arg)
	{   System.out.println("Enter the Bill: ");
	    Scanner myObj = new Scanner(System.in);
	    double Bill = myObj.nextDouble();
	    if(Bill>1000)
	    	System.out.println("Discount is Appilicable");
	    else
	    	System.out.println("Discount is Not Appilicable");
	
	}
	
} 
 
