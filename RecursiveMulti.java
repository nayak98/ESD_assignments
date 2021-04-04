//15. Implement a JAVA program to multiply two numbers using recursive multiplication.
import java.util.Scanner;


class RecursiveMulti{
	double myproduct(double x, double y)
		{
		if(y == 0){
			return 0;
		}
		else{
		
		return (x + myproduct(x, y - 1));
		
		}
	}


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number\n");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		RecursiveMulti obj = new RecursiveMulti();
		System.out.println("product is : "+obj.myproduct(num1,num2));
	}
}