package kodlama.�o;



public class StudentManager extends UserManager {

	public void KursaKay�t(Student student) {
		System.out.print( "eklendi :   " +student.getEposta() +student.getFirstName()  +student.getLastName()  +student.getKurslar() );
		
		
	}
	public void BirseylerGonder() {
		
	}
	
	public void addMittiple(Student[] students){
		
		for (Student student : students) {
			
		
		KursaKay�t(student);
		}
	}
}
