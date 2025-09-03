//Basic Array lists
import java.util.ArrayList;
public class ArrayDemo2{
	public static void main(String args[]){
		ArrayList<String> names=new ArrayList<>();
		names.add("Pavan");
		names.add("Chakri");
		names.add("Prasnth");
		names.add("Saketh");
		String searchname="Saketh";
		if(names.contains(searchname)){
			System.out.println(searchname+" is found");
		}else{
			System.out.println(searchname+" is not found in the list");
		}		
	}	
}		
