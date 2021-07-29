class Animal{
	public void eat()
	{
		System.out.println("Animal eats");
	}
	public void sleep()
	{
		System.out.println("Animal sleeps");
	}
}
class Bird{
	public void eat()
	{
		System.out.println("Bird eats");
	}
	public void sleep()
	{
		System.out.println("Bird sleeps");
	}
	public void fly()
	{
		System.out.println("Bird flies");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.sleep();
		animal.eat();
		Bird bird = new Bird();
		bird.sleep();
		bird.eat();
		bird.fly();
	}

}
