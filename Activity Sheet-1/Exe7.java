import java.util.Scanner;
class Exe7
{  public static void main(String[] arg)
   {    System.out.println("Enter a Number:");
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        int i,sum;
        i=1; sum=0;
        while(i<=N)
        {   if(i%2==0)
              sum=sum+i; //sum logic
            i++;	
        }
	    System.out.printf("sum of all even numbers from 1 to %d is %d",N,sum);
   }
} 
/* for loop
   for(i=1;i<=n;i++)  */ 
