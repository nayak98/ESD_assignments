public class Armstrong
{
	public static void main (String  args[])
	{
		int number =153;

		int remainder, result =0;
		int num = number;
		while(number !=0)
		{
			remainder = number % 10;
            result += remainder*remainder*remainder;
            number /= 10;
		}

		if(result == num)
		{
			System.out.println(num + " is an armstrong number");
		}
		else
		{
			System.out.println(num +" is not an armstrong number");
		}
	}
}
