package kodlamaio;

public class StudentManager {
	public void selectCourse(Student student) {
		System.out.println(student.getFirstName() + " adlý kullanýcý " + student.getCourseSelection() + ". kursu seçmiþtir.");
	}	
		public void selectMultipleCourse(Student[] students) {
			for (Student student : students) {
				selectCourse(student);
			}
		}
}
