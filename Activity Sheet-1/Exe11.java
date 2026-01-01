import java.util.Scanner;
class Exe11
{   public static void main(String[] arg)
	{   System.out.print("Arthemetic Operation Menu \n");
	    System.out.print(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
	    Scanner myObj = new Scanner(System.in);
	    System.out.print("\n Enter the values N1 AND N2:");
	    double N1 = myObj.nextDouble();
	    double N2 = myObj.nextDouble();
	    System.out.print("Choose the operation:");
	    int choose = myObj.nextInt();
	    switch(choose)
	    {  case 1:
	    	System.out.printf("Result = %.2f",N1+N2);
	    	break;
	       case 2:
	    	System.out.printf("Result = %.2f",N1-N2);
	    	break;
	       case 3:
	    	System.out.printf("Result = %.2f",N1*N2);
	    	break;
	       case 4:
	    	if(N2!=0)
	    		System.out.printf("Result = %.2f",N1/N2);
	    	else
	    		System.out.println("Error:Can't be divided by Zero");
	    }
	}
}