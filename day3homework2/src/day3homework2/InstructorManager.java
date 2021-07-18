package day3homework2;

public class InstructorManager extends UserManager {

	public void gradeHomework(Instructor instructor, int grade) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " ödeve " + grade + " puan verdi.");
	}

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getCourseName()
				+ " kursuna atandý!");
	}
}
