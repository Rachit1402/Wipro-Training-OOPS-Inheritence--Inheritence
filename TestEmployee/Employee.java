
public class Employee extends Person{
	private double Salary;
	private int StartingYear;
	private String InsuranceNumber;
	public Employee(String name, double Salary, int StartingYear,String InsuranceNumber ) {
		super();
		this.name = name;
		this.Salary = Salary;
		this.StartingYear = StartingYear;
		this.InsuranceNumber = InsuranceNumber;
	}

	public double getSalary()
	{
		return Salary;
	}
	public int getStartingYear()
	{
		return StartingYear;
	}
	public String getInsuranceNumber()
	{
		return InsuranceNumber;
	}
	
	public String toString()
	{
		return ("Employee: [ "+name+ "  Salary" + Salary+ "  Year of Joining "+StartingYear+"  Insurance Number "+InsuranceNumber+"]");
	}
}
