
public class StudentManager extends UserManager {
	@Override
	public void signUp(User user) {
		//kay�t i�lemleri
		System.out.println("\nKay�t ba�ar�l�! : " + user.getFirstName() + user.getLastName());
	}
	
	public void rollCall(Student student) {
		//yoklamaya kat�lma
		System.out.println(student.getFirstName() + 
				           student.getLastName() + 
				           " Yoklaman�z al�nd�. Derse d�nebilirsiniz");
	}
}
