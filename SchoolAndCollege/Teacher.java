public class Teacher extends Person1{
	private int Salary;
	private String Subject;
	public Teacher(String name, String DateOfJoining,int Salary, String Subject)
	{
		super(name, DateOfJoining);
		this.Salary = Salary;
		this.Subject = Subject;
	}
	
	public int getSalary()
	{
		return Salary;
	}
	public String getSubject()
	{
		return Subject;
	}
	
public void main(String[] args)	{
	System.out.println("Salary: "+ Salary+ " Subject "+Subject);
}
}