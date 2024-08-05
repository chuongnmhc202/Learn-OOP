package Ex1;

public class Student extends Person {
	private String id;
	private double score;
	
	public Student() {
		super();
		id = "";
		score = 0.0;
	}
	
	public Student(String name, int birthYear, String id, double score) {
		super(name,birthYear);
		this.id = id;
		this.score = score;
	}
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', score=" + score + ", " + super.toString() + '}';
    }
}
