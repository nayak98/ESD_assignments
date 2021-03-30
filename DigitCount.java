import java.util.Scanner;
 
public class DigitCount
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number :"); 
    	int inputnumber = sc.nextInt();

    	System.out.println("Enter the digit to count :"); 
    	int digit = sc.nextInt();

        int num=inputnumber;
        int count=0;


         while(num>0)
        {
        	int rem=num%10;
        	if(rem==digit)
        		count++;
        	num=num/10;
        }

        System.out.printf("the count of %d in %d is: %d",digit,inputnumber,count);
    }
}
