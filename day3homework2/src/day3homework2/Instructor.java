package day3homework2;

public class Instructor extends User {
	String courseName;

	public Instructor() {
	}

	public Instructor(int id, String firstName, String lastName, String password, String email, String courseName) {
		super(id, firstName, lastName, password, email);
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
