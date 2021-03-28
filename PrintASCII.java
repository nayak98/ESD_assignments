public class PrintASCII
{
	public static void main(String[] args)
		{
			char ch1='A';
			char ch2='a';
			int  num=5;


			int ascii1=ch1;
			int ascii2=ch2;
			int ascii3=num+48;


			System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);  
			System.out.println("The ASCII value of " + ch2 + " is: " + ascii2); 
			System.out.println("The ASCII value of " + num + " is: " + ascii3); 
		}
}