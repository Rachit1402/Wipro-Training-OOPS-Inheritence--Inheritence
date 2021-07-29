
public class TestInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher("Amisha", "20-jan-1980",40000,"Electrical Engineering");
		CollegeStudent college = new CollegeStudent("Rachit","14-February-1999",12345,"ABES Engineering College", "Fourth");
		teacher.display();
		college.display();
	}

}
