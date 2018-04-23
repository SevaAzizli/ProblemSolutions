package Array;

public class ShapeArea {

	public static void main(String[] args) {
		
		shapeArea(5);
	}

	static int shapeArea(int n) {

		if(n ==1)  return 1;
			
		int temp = (int) Math.pow(n, 2) + (int) Math.pow((n-1), 2);

		System.out.println("The sheap area of "+n+" is "+temp);	
			
	
	return temp;
			
}
	
	
	
}