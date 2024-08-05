package Shape;

public class Shape {
	protected String color="red";
	protected boolean filled = true;
	
	public Shape(){
		this.color="red";
		this.filled = true;
	}
	
	public Shape(String color,boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "color: "+color+" filled: "+filled;
	}
	public double getArea() {
        // Trả về giá trị mặc định, các lớp con sẽ ghi đè phương thức này
        return 0;
    }

    public double getPerimeter() {
        // Trả về giá trị mặc định, các lớp con sẽ ghi đè phương thức này
        return 0;
    }

}
