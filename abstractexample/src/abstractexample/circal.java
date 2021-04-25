package abstractexample;

public class circal extends Shape  {
	private int radious;
	public double getArea() {
		
		return Math.PI*radious*radious;
	}
	
	public void cal(int x , int y) {
		
		System.out.println("cal in circle");
	}
}
