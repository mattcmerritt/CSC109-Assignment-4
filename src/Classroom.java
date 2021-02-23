
public class Classroom {
	
	// This class will represent a single classroom of multiple Students
	
	private String name;
	private Student[] roster;

	public Classroom(String name, Student[] roster) {
		this.name = name;
		this.roster = roster;
	}
	
	public String toString() {
		String result = name + "; Students: ";
		for (int i = 0; i < roster.length; i++) {
			if (i != roster.length - 1)
				result += roster[i].getName() + ", ";
			else {
				result += roster[i].getName();
			}
		}
		
		if (roster.length == 0) {
			result += "No students enrolled";
		}
		
		return result;
	}
	
	public double getClassroomAverage() {
		double sum = 0;
		
		if (roster.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < roster.length; i++) {
			sum += roster[i].getCurrentAverage();
		}
		sum /= roster.length;
		return sum;
	}
	
	public String getName() {
		return name;
	}
}
