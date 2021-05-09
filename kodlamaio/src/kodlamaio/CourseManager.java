package kodlamaio;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println(course.name + " kurs eklendi");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.name + " kurs silindi");
	}
}
