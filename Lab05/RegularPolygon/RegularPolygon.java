package RegularPolygon;

public class RegularPolygon {
	private String name;
	private int edgeAmount;
	private double edgeLength;
	
	public RegularPolygon() {
		name = "";
		edgeAmount = 3;
		edgeLength = 1;
	}

	public RegularPolygon(String name, int edgeAmount, double edgeLength) {
		this.name = name;
		this.edgeAmount = edgeAmount;
		this.edgeLength = edgeLength;
	}
	
	public RegularPolygon(String name, int edgeAmount) {
		this.name = name;
		this.edgeAmount = edgeAmount;
		this.edgeLength = 1;
	}
	
	public RegularPolygon(RegularPolygon polygon) {
		this.name = polygon.name;
		this.edgeAmount = polygon.edgeAmount;
		this.edgeLength = polygon.edgeLength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdgeAmount() {
		return edgeAmount;
	}

	public void setEdgeAmount(int edgeAmount) {
		this.edgeAmount = edgeAmount;
	}

	public double getEdgeLength() {
		return edgeLength;
	}

	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	
	
	
}
