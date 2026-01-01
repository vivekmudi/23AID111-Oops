import java.util.Scanner;
class Exe8
{   public static void main(String[] arg)
	{   System.out.println("Enter a Number:");
	    Scanner myObj = new Scanner(System.in);
	    int N = myObj.nextInt();
	    int  digit,sum;
	    sum=0;
	    while(N>0)
	    {   digit=N%10;
	        sum=sum+digit;
	        N=N/10;
	    }
	    if(sum%2==0)
	    	System.out.println("Given Number is a Special Number");
	    else
	    	System.out.println("Given Number is not a Special Number");    
	}
}