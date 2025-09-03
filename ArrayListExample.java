//Basic Array lists examples
import java.util.ArrayList;
public class ArrayListExample{
	public static void main(String args[]){
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("PineApple");
		fruits.add("Guava");
		System.out.println("The Fruits are :"+fruits);
		System.out.println("The First fruit is :"+fruits.get(0));
		fruits.remove("Guava");
		System.out.println("The fruits after removing are:"+fruits);	
	}
}	
