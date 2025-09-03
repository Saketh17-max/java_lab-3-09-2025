//Basic Array lists of objects
import java.util.ArrayList;
class Student{
	int id;
	String name;
	Student(int i,String n){
		this.id=i;
		this.name=n;
	}
	public String toString(){
		return id+"-"+name;
	}
}
public class ArrayDemo3{
	public static void main(String args[]){
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(1,"Raghu"));
		students.add(new Student(2,"Tharun"));
		students.add(new Student(3,"Pavan"));
		students.add(new Student(4,"Jay"));
		students.add(new Student(5,"Krishna"));
		for(Student s: students){
			System.out.println(s);
		}
	}
}				
		
