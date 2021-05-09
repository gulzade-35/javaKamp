package kodlamaio;

public class Main {

	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		
		Student student1= new Student(1, "G�lzade", "Odaba�","2");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�"); 
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirci Yeti�tirici Kamp�(C + Angular)", "%95");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirici Kampu(Java + React)"," %30");
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","%100");
		
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
