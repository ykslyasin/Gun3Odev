
public class Main {

	public static void main(String[] args) {
		User kullan�c�1 = new User();
		kullan�c�1.setFirstName("Burak");
		kullan�c�1.setLastName("�ahin");
		kullan�c�1.seteMail("sahin.burak@kodlama.io");
		kullan�c�1.setPassword("123321");
		
		
		Instructor ogretmen1 = new Instructor();
		ogretmen1.setFirstName("Engin");
		ogretmen1.setLastName("Demiro�");
		ogretmen1.seteMail("demirog.engin@kodlama.io");
		ogretmen1.setPassword("54321");
		ogretmen1.setCertificates("MCT , PMP , ITIL , :)");
		
		
		Student ogrenci1 = new Student();
		ogrenci1.setFirstName("Yasin");
		ogrenci1.setLastName("Y�ksel");
		ogrenci1.seteMail("yuksel.yasin@kodlama.io");
		ogrenci1.setPassword("12345");
		ogrenci1.setSchool("�niversite");
		
		
		
		UserManager userManager = new UserManager();
		userManager.signUp(kullan�c�1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp(ogretmen1);
		instructorManager.addLesson(ogretmen1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.signUp(ogrenci1);
		studentManager.rollCall(ogrenci1);
		
		
	}

}
