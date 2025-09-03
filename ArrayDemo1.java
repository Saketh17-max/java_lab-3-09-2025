//Basic Array lists
import java.util.ArrayList;
public class ArrayDemo1{
	public static void main(String args[]){
		ArrayList<Integer> number=new ArrayList<>();
		for(int i=1;i<=6;i++){
			number.add(i);
		}
		System.out.println("Using forEach loop");
		for(int n:number){
			System.out.println(n);
		}
		System.out.println("Using for loop");
		for(int i=0;i<6;i++){
			System.out.println(number.get(i));
		}		
	}
}	
