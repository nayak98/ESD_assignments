import java.util.Scanner;

class PrimeFactor{
	static boolean isPrime(int num){
		int i;
		for(i = 2; i < num; i++){
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number\n");
		int num = sc.nextInt();

		int i;
		for(i = 2 ; i <= num ; i++)
		{
			if((num % i) == 0){
				if(isPrime(i)){
					System.out.println(i);
				}
			}
		}
		
	}
}