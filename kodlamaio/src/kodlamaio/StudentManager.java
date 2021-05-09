package kodlamaio;

public class StudentManager {
	public void selectCourse(Student student) {
		System.out.println(student.getFirstName() + " adl� kullan�c� " + student.getCourseSelection() + ". kursu se�mi�tir.");
	}	
		public void selectMultipleCourse(Student[] students) {
			for (Student student : students) {
				selectCourse(student);
			}
		}
}
