
public class StudentTest {
	
	// This class is intended to check if everything is working with Student.java

	public static void main(String[] args) {
		Student matt = new Student("Matthew", "matt@example.com", 1);
		
		System.out.println("Starting average: " + matt.getCurrentAverage());
		
		matt.addGrade(100, 100);
		System.out.println(matt);
		
		System.out.println("Name: " + matt.getName());
		System.out.println("Email: " + matt.getEmail());
		System.out.println("Year: " + matt.getYear());
		System.out.println("Points Earned: " + matt.getPointsEarned());
		System.out.println("Total Points: " + matt.getTotalPoints());
		
		matt.addGrade(92, 100);
		matt.addGrade(48, 50);
		
		System.out.println("Final average: " + matt.getCurrentAverage());
		System.out.println("Final grade: " + matt.getCurrentLetterGrade());
		
		System.out.println();
		
		Student alice = new Student("Alice", "alice@example.com", 1);
		Student bob = new Student("Bob", "bob@example.com", 3);
		Student charles = new Student("Charles", "charles@example.com", 2);
		Student daniel = new Student("Daniel", "daniel@example.com", 4);
		
		alice.addGrade(100, 100);
		bob.addGrade(0, 50);
		charles.addGrade(87, 100);
		daniel.addGrade(150, 200);
		
		System.out.println(alice);
		System.out.println("Alice's Grade: " + alice.getCurrentLetterGrade());
		System.out.println(bob);
		System.out.println("Bob's Grade: " + bob.getCurrentLetterGrade());
		System.out.println(charles);
		System.out.println("Charles's Grade: " + charles.getCurrentLetterGrade());
		System.out.println(daniel);
		System.out.println("Daniel's Grade: " + daniel.getCurrentLetterGrade());
	}

}
