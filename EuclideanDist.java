import java.lang.Math;

class EuclideanDist{
	public static void main(String args[]){
		int x1= 3;
		int x2 = 6;
		int y1 = 2;
		int y2 = 7;
		Double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance : " + distance);
	}
}