package kodlamaio;

public class InstructorManager {
	public void add(Instructor insturctor) {
		System.out.println(insturctor.getFirstName() +" "+ insturctor.getLastName() + " se�ildi");
	}
	
	public void addMultiple(Instructor[] instructors) {
		for(Instructor instructor:instructors) {
			add(instructor);
		}
	}
	
}
