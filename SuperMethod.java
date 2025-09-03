//Super method
class Parent{
	Parent(){
		System.out.println("Parent constructor is called");
	}
	void Display(){
		System.out.println("Parent method is called");
	}
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("Child constructor is called");
	}
	void Show(){
		super.Display();
		System.out.println("Child method is called");
	}
}
public class SuperMethod{
	public static void main(String args[]){
		Child c=new Child();
		c.Show();
	}
}								
