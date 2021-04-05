class Count{
	public static void main(String args[]){
		int num = 322342;
		int digit = 2;
		int count = 0;
		int number;
		while(num > 0){
			number = num % 10;
			if(digit == number){
				count++;
			}		
			num = num / 10;
		}
		System.out.println("count of "+digit+" : "+count);
	}
}