package House;

public class House {
	private String houseCode;
	private int numOfBedRooms;
	private boolean hasSwimmingPool;
	private double area;
	private double costPerSquareMeter;
	
	public House() {
		houseCode = "A01";
		numOfBedRooms = 2;
		hasSwimmingPool = false;
		area = 0;
		costPerSquareMeter = 0;
	}
	
	public House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
		this.houseCode = houseCode;
		this.numOfBedRooms = numOfBedRooms;
		this.hasSwimmingPool = hasSwimmingPool;
		this.area = area;
		this.costPerSquareMeter = costPerSquareMeter;
	}


	public String getHouseCode() {
		return houseCode;
	}


	public void setHouseCode(String houseCode) {
		this.houseCode = houseCode;
	}


	public int getNumOfBedRooms() {
		return numOfBedRooms;
	}


	public void setNumOfBedRooms(int numOfBedRooms) {
		this.numOfBedRooms = numOfBedRooms;
	}


	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}


	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getCostPerSquareMeter() {
		return costPerSquareMeter;
	}


	public void setCostPerSquareMeter(double costPerSquareMeter) {
		this.costPerSquareMeter = costPerSquareMeter;
	}
	
	public double calculateSellingPrice() {
		double SubTotal = area*costPerSquareMeter;
		if(hasSwimmingPool) SubTotal += 0.1 * SubTotal;
		return SubTotal + 0.15*SubTotal;
	}
	
	public String toString() {
		return String.format("House[%s, %d, %b, %.2f]",houseCode, numOfBedRooms, hasSwimmingPool, calculateSellingPrice());
	}
	
}
