class Pronic
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);

		int i;
		for( i = 1; i < num; i++)
		{
			if((num % i) == 0){
				if((num % (i + 1))== 0)
				{
					System.out.println("Number is pronic");
					return;
				}
			}
		}
		System.out.println("Number is not pronic");
	}
}