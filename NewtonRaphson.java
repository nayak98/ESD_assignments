//6. Implement a JAVA program to find the square using newton raphson method.
import java.util.Scanner;
 
class NewtonRaphson{

	static double squareRoot(double n, double l)  
    {  
        double x = n;   
        double root;  
        int count = 0;  
      
        while (true) 
        {  
            count++;  
            root = 0.5 * (x + (n / x));  
            if (Math.abs(root - x) < l)  
                break;  
            x = root;  
        }  
      
        return root;  
    }  
       
    public static void main (String[] args)  
    {  
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double n = sc.nextDouble();
        double l = 0.00001;  
      
        System.out.println(squareRoot(n, l));  
    }  
} 