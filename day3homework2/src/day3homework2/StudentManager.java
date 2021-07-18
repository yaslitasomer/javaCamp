package day3homework2;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getCourseTaken()
				+ " kursuna kaydedildi!");
	}

	public void uploadHomework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " ödevini yükledi!");
	}
}
