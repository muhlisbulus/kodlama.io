package kodlama.İo;



public class StudentManager extends UserManager {

	public void KursaKayıt(Student student) {
		System.out.print( "eklendi :   " +student.getEposta() +student.getFirstName()  +student.getLastName()  +student.getKurslar() );
		
		
	}
	public void BirseylerGonder() {
		
	}
	
	public void addMittiple(Student[] students){
		
		for (Student student : students) {
			
		
		KursaKayıt(student);
		}
	}
}
