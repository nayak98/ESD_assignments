//50. Implement a java program to find the LCD of the given numbers.

class LCD{
	int LCD(int num1, int num2){
		int i = 1 , j = 1;
		int temp1 = num1;
		int temp2 = num2;
		
		while(num1 != num2){
			
			if(num2 > num1){
				num1 = temp1 * i;
				i++;
				
				}
			if (num1 > num2){
				num2 = temp2 * j;
				j++;
				
				}
				
			
		}
		return num2;
	}
	
	public static void main(String args[]){
		LCD obj = new LCD();
		int num1 = 2;
		int denom1 =5;
		int num2 = 4;
		int denom2 = 6;
		System.out.println("LCD of fractions : "+obj.LCD(denom1, denom2));
	
	
	}
}