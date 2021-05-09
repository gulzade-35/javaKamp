package kodlamaio;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private String courseSelection;
	
	public Student() {
		
	}
	
	public Student(int studentId, String firstName, String lastName, String courseSelection) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseSelection = courseSelection;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseSelection() {
		return courseSelection;
	}

	public void setCourseSelection(String courseSelection) {
		this.courseSelection = courseSelection;
	}
}
