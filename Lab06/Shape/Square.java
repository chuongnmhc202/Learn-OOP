package Shape;

public class Square extends Rectangle{
	public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side,String color,boolean filled) {
    	super(side,side, color,filled);
    }
    
    public double getSide() {
    	return getWidth();
    }
    
    public void setSide(double side) {
    	setWidth(side);
    	setLength(side);
    }
    
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    
    public void setLength(double length) {
    	super.setLength(length);
    	super.setWidth(length);
    }

    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Square[side=" + getWidth() + ", color=" + color + ", filled=" + filled + "]";

    }
	
    
}
