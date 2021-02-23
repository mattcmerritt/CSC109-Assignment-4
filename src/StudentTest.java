
public class StudentTest {
	
	// This class is intended to check if everything is working with Student.java

	public static void main(String[] args) {
		Student matt = new Student("Matthew", "matt@example.com", 1);
		
		System.out.println("Starting average: " + matt.getCurrentAverage());
		
		matt.addAssignment(new Assignment("Assignment 1", 100, 100));
		System.out.println(matt);
		
		System.out.println("Name: " + matt.getName());
		System.out.println("Email: " + matt.getEmail());
		System.out.println("Year: " + matt.getYear());
		System.out.println("Points Earned: " + matt.getPointsEarned());
		System.out.println("Total Points: " + matt.getTotalPoints());
		
		matt.addAssignment(new Assignment("Assignment 2", 92, 100));
		matt.addAssignment(new Assignment("Assignment 3", 48, 50));
		
		System.out.println("Final average: " + matt.getCurrentAverage());
		System.out.println("Final grade: " + matt.getCurrentLetterGrade());
		
		System.out.println();
		
		System.out.println(matt.outputAssignments());
		
		System.out.println();
		
		Student alice = new Student("Alice", "alice@example.com", 1);
		Student bob = new Student("Bob", "bob@example.com", 3);
		Student charles = new Student("Charles", "charles@example.com", 2);
		Student daniel = new Student("Daniel", "daniel@example.com", 4);
		
		alice.addAssignment(new Assignment("Assignment 1", 100, 100));
		bob.addAssignment(new Assignment("Assignment 3", 0, 50));
		charles.addAssignment(new Assignment("Assignment 2", 87, 100));
		daniel.addAssignment(new Assignment("Assignment 4", 150, 200));
		
		System.out.println(alice);
		System.out.println("Alice's Grade: " + alice.getCurrentLetterGrade());
		System.out.println(bob);
		System.out.println("Bob's Grade: " + bob.getCurrentLetterGrade());
		System.out.println(charles);
		System.out.println("Charles's Grade: " + charles.getCurrentLetterGrade());
		System.out.println(daniel);
		System.out.println("Daniel's Grade: " + daniel.getCurrentLetterGrade());
		
		System.out.println();
		
		Classroom mathClass = new Classroom("Math Class", new Student[] {alice, bob, charles, daniel});
		Classroom emptyClass = new Classroom("Empty Class", new Student[] {});
		
		System.out.println(mathClass);
		System.out.println(emptyClass);
	}

}
