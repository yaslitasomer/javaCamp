package day3homework2;

public class Student extends User {
	  String courseTaken;

	  public Student() {
	  }

	  public Student(int id, String firstName, String lastName, String password, String email, String courseTaken) {
	    super(id, firstName, lastName, password, email);
	    this.courseTaken = courseTaken;
	  }

	  public String getCourseTaken() {
	    return courseTaken;
	  }

	  public void setCourseTaken(String courseTaken) {
	    this.courseTaken = courseTaken;
	  }
	}