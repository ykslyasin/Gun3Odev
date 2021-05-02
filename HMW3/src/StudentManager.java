
public class StudentManager extends UserManager {
	@Override
	public void signUp(User user) {
		//kayýt iþlemleri
		System.out.println("\nKayýt baþarýlý! : " + user.getFirstName() + user.getLastName());
	}
	
	public void rollCall(Student student) {
		//yoklamaya katýlma
		System.out.println(student.getFirstName() + 
				           student.getLastName() + 
				           " Yoklamanýz alýndý. Derse dönebilirsiniz");
	}
}
