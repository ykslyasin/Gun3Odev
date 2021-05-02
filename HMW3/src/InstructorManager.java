
public class InstructorManager extends UserManager {
	@Override
	public void signUp(User user) {
		//kayýt iþlemleri
		System.out.println("\nKayýt baþarýlý! : " + user.getFirstName() + user.getLastName());
	}
	
	public void addLesson(Instructor instructor) {
		//ekleme iþlemi
		System.out.println("Ders eklendi. Ekleyen : " + 
		                    instructor.getFirstName() + 
				            instructor.getLastName());
	}
}
