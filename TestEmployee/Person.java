
public class Person {
	protected String name;

	public Person(String name){
		this.name = name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getPerson(){
		return name;
	}
	public String toString(){
		return ("Person[ name = "+name+" ]");
	}
	
}
