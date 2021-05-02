
public class Main {

	public static void main(String[] args) {
		User kullanýcý1 = new User();
		kullanýcý1.setFirstName("Burak");
		kullanýcý1.setLastName("Þahin");
		kullanýcý1.seteMail("sahin.burak@kodlama.io");
		kullanýcý1.setPassword("123321");
		
		
		Instructor ogretmen1 = new Instructor();
		ogretmen1.setFirstName("Engin");
		ogretmen1.setLastName("Demiroð");
		ogretmen1.seteMail("demirog.engin@kodlama.io");
		ogretmen1.setPassword("54321");
		ogretmen1.setCertificates("MCT , PMP , ITIL , :)");
		
		
		Student ogrenci1 = new Student();
		ogrenci1.setFirstName("Yasin");
		ogrenci1.setLastName("Yüksel");
		ogrenci1.seteMail("yuksel.yasin@kodlama.io");
		ogrenci1.setPassword("12345");
		ogrenci1.setSchool("Üniversite");
		
		
		
		UserManager userManager = new UserManager();
		userManager.signUp(kullanýcý1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp(ogretmen1);
		instructorManager.addLesson(ogretmen1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.signUp(ogrenci1);
		studentManager.rollCall(ogrenci1);
		
		
	}

}
