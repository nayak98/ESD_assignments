import java.util.Scanner;
import java.lang.Math.*;
 
public class Area
{   


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the choice :"); 
        System.out.println("1.circle"); 
        System.out.println("2.rectangle");
        System.out.println("3.square"); 
        System.out.println("4.trapezoid");
        System.out.println("5.rhombus");
        System.out.println("6.triangle");    
    	int choice = sc.nextInt();

   		switch(choice)
   		{
   			case 1:
   				System.out.println("Enter the radius :");
   				int r=sc.nextInt();

   				System.out.printf("the are of circle is:%f",2*Math.PI*r);
   				break;

   			case 2:
   				System.out.println("Enter the length and breadth :"); 
   				int l=sc.nextInt();
   				int b=sc.nextInt();

   				System.out.printf("the are of rectangle is:%d",l*b);
   				break;

   			case 3:
   				System.out.println("Enter the side :");
   				int a= sc.nextInt();

   				System.out.printf("the are of square is:%d",a*a);
   				break;

   			case 4:
   				 System.out.println("Enter the 2 base and height :");
   				 int b1=sc.nextInt();
   				 int b2=sc.nextInt();
   				 int h=sc.nextInt();

   				System.out.printf("the are of rectangle is:%d",(((b1+b2)/2)*h));
   				break;	

   			case 5:
   				System.out.println("Enter the  base and height :");
   				int b3=sc.nextInt();
   				int h1=sc.nextInt();

   				System.out.printf("the are of rhombus is:%d",b3*h1);
   				break;

   			case 6:
   				System.out.println("Enter the  base and height :");
   				int b4=sc.nextInt();
   				int h2=sc.nextInt();

   				System.out.printf("the are of triangle is:%d",((b4*h2)/2));
   				break;
   		}

   	}
}
