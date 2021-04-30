package kodlama.İo;

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Muhlis");
		student1.setLastName("Buluş");
		student1.setKurslar("c#,java");
		student1.setEposta("muhlisbulus79@gmail.com");
		student1.setSifre("132412255");
		
		
	  Student student2=new Student();
	  
	  student2.setId(2);
		student2.setFirstName("Erkan");
		student2.setLastName("Can");
		student2.setKurslar("c#");
		student2.setEposta("ErkanCan1@gmail.com");
		student2.setSifre("13241225567");
		
		StudentManager studentManager=new StudentManager();
		Student[] students= {student1,student2};
		studentManager.addMittiple(students);
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setCv("");
		instructor1.setFirstName("Engin");
		instructor1.setLastName(" Demirog");
		instructor1.setKurslar("c#,java");
		
		Instructor instructor2=new Instructor();
		instructor2.setId(2);
		instructor2.setCv("");
		instructor2.setFirstName("Mustafa Murat ");
		instructor2.setLastName(" Coşkun");
		instructor2.setKurslar("java");
		
		InstructorManager instructorManager=new InstructorManager();
		
		Instructor[] instructors= {instructor1,instructor2};
		
		instructorManager.AddMittiple(instructors);
		
		

	}

}
