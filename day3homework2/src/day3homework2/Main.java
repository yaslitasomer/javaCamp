package day3homework2;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student(54726, "Jaden", "Bruen", "lQk4kShbnscpZ4u", "bruen_jadenqgmail.com", "JAVA");
		Student student2 = new Student(77828, "Rocky", "Ledner", "C2dF7x9uRrkemxu", "lednerrocky@gmail.com", "REACT");
		Student student3 = new Student(67665, "Howard", "Bergstrom", "FP__voS4aN7JaoY", "howardbergs2511@gmail.com",
				"C++");
		Instructor instructor1 = new Instructor(77573, "Engin", "Demirog", "OkmcK7GU9uh9THu", "engindemirog@gmail.com",
				"REACT");

		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		Student[] students = { student1, student2, student3 };
		Instructor[] instructors = { instructor1 };

		for (Student student : students) {
			studentManager.add(student);
		}

		for (Instructor instructor : instructors) {
			instructorManager.add(instructor);
		}
	}
}
