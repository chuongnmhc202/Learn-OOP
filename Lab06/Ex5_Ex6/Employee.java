package Ex5_Ex6;

public class Employee {
	protected String ID;
	protected String fullName;
	protected int yearJoined;
	protected double coefficientsSalary;
	protected int numDaysOff;
	
	public Employee() {
		ID = "0";
		fullName = "";
		yearJoined = 2020;
		coefficientsSalary = 1.0;
		numDaysOff = 0;
	}

	public Employee(String iD, String fullName, double coefficientsSalary) {
		yearJoined = 2020;
		numDaysOff = 0;
		ID = iD;
		this.fullName = fullName;
		this.coefficientsSalary = coefficientsSalary;
	}

	public Employee(String iD, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
		ID = iD;
		this.fullName = fullName;
		this.yearJoined = yearJoined;
		this.coefficientsSalary = coefficientsSalary;
		this.numDaysOff = numDaysOff;
	}
	
	public double getSenioritySalary() {
		int nam = 2024-yearJoined;
		if(nam>=5) return nam * 1150 / 100.0;
		return 0;
	}
	
	public String considerEmulation() {
		if(numDaysOff<=1) return "A";
		else if(numDaysOff<=3) return "B";
		else return "C";
	}
	
	public double getSalary() {
		double rate;
		if(considerEmulation().equals("A")) rate = 1.0;
		else if(considerEmulation().equals("B")) rate = 0.75;
		else rate = 0.5;
		return 1150+1150*(coefficientsSalary+rate);
	}
	
}
