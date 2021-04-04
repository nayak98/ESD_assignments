//29. Implement a Java program to check a number is a cube or not

import java.lang.Math;
class Cube{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int n = (int) Math.round(Math.pow(num, 1.0/3.0));
		if(num ==(n*n*n)){
			System.out.print("Number is a perfect cube");
		}
		else{
			System.out.print("Number is a not perfect cube");
		}
	}
}