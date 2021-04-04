//5. Implement a JAVA program to find the square root of the number. (import MATH,can use sqrt)
import java.util.Scanner;
import java.lang.Math;
 
public class Squareroot
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        double number = sc.nextDouble();

        System.out.println("Square root of the number is : "+ Math.sqrt(number));		
	}
}

