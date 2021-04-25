package abstractexample;

abstract public class Shape {

	
	public void show() {
		System.out.println("this is a shape class");
		
	}
	
	abstract public double getArea();
	
	
	abstract public void cal(int x , int y);
}
