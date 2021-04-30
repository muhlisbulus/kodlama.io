package kodlama.Ýo;

public class InstructorManager extends UserManager {
	
	public void Add(Instructor instructor) {
		System.out.println("eklendi : " +instructor.getKurslar());
		
	}
	public void AddMittiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			Add(instructor);
		}
	}
	

}
