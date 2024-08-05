package Ex5_Ex6;

public class Manager extends Employee{
	private String position;
	private double salaryCoefficientPosition;
	
	public Manager() {
		super();
		this.position = "Head of Administrative Office";
		this.coefficientsSalary = 5.0;
		this.salaryCoefficientPosition = 1.5;
	}
	
	public Manager(String ID,String fullName,double coefficientsSalary, String position, double salaryCoefficientPosition) {
		super(ID, fullName, coefficientsSalary);
		this.position = position;
		this.salaryCoefficientPosition = salaryCoefficientPosition;
	}

	public Manager(String iD, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff,
			String position, double salaryCoefficientPosition) {
		super(iD, fullName, yearJoined, coefficientsSalary, numDaysOff);
		this.position = position;
		this.salaryCoefficientPosition = salaryCoefficientPosition;
	}
	
	public String considerEmulation() {
		return "A";
	}
	
	public double bonusByPosition() {
		return 1150 * salaryCoefficientPosition;
	}
	
	public double getSalary() {
		return 1150 + 1150 * (coefficientsSalary + 1.0) + getSenioritySalary() + bonusByPosition();
	}
	
}
