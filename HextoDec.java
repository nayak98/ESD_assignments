//51. Find the hexadecimal equivalent for a given 4-digit binary number.
import java.util.Scanner;

public class HextoDec
{

	 String BinaryToHex(long binary)
    {
        
       int decimalNumber = 0, i = 0;
  
       		while (binary > 0) {
  				decimalNumber
                += Math.pow(2, i++) * (binary % 10);
  				binary /= 10;
        	}
  
        
        String hexNumber
            = Integer.toHexString(decimalNumber);
  
        
        hexNumber = hexNumber.toUpperCase();
  
        
        return hexNumber;
    }
	public static void main(String args[])
	{
		HextoDec ob = new HextoDec();
  		
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the number :");
         
        long num = sc.nextLong();
        //long num = 1000;
        
       
        System.out.println("Input number : " +num);
        System.out.println(ob.BinaryToHex(num));
	}
}