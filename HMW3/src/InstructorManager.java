
public class InstructorManager extends UserManager {
	@Override
	public void signUp(User user) {
		//kay�t i�lemleri
		System.out.println("\nKay�t ba�ar�l�! : " + user.getFirstName() + user.getLastName());
	}
	
	public void addLesson(Instructor instructor) {
		//ekleme i�lemi
		System.out.println("Ders eklendi. Ekleyen : " + 
		                    instructor.getFirstName() + 
				            instructor.getLastName());
	}
}
