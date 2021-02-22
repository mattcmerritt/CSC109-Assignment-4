
public class Assignment {
	
	// This class will represent a single assignment grade that can be given to a Student

	private String name;
	private int pointsEarned;
	private int totalPoints;
	
	public Assignment(String name, int pointsEarned, int totalPoints) {
		this.name = name;
		this.pointsEarned = pointsEarned;
		this.totalPoints = totalPoints;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPointsEarned() {
		return pointsEarned;
	}
	
	public int getTotalPoints() {
		return totalPoints;
	}
	
	// method to return the grade earned on the assignment
	public double getGrade() {
		return pointsEarned / totalPoints;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	public String toString() {
		return name + "; Score: " + getGrade();
	}
}
