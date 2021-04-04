import java.lang.Math;

class Mersenne{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		
		double temp = Math.log(num + 1)/Math.log(2);
		
		if( temp == (int) temp ){
			System.out.println("Mersenne number");
		}
	}
}