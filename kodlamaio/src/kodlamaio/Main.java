package kodlamaio;

public class Main {

	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		
		Student student1= new Student(1, "Gülzade", "Odabaş","2");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ"); 
		
		Course course1 = new Course(1,"Yazılım Geliştirci Yetiştirici Kampı(C + Angular)", "%95");
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirici Kampu(Java + React)"," %30");
		Course course3 = new Course(3,"Programlamaya Giriş için Temel Kurs","%100");
		
		Course[] courses = {course1, course2, course3};
		
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		
		Student[] student = {student1};
		studentManager.selectCourse(student1);
		
		Instructor[] instructors = {instructor1};
		instructorManager.add(instructor1);

	}

}
