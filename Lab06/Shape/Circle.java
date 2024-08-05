package Shape;

public class Circle extends Shape{
	private double radius = 1.0;
	public Circle(){
		super();
		radius = 1.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2* Math.PI*radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" radius: "+this.radius;
	}
	
}
