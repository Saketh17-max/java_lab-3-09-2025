//area inheritance to find areas of different shapes
class Triangle{
	double base;
	double height;
	Triangle(double b,double h){
		this.base=b;
		this.height=h;	
	}
	void Area(){
		double area=0.5*base*height;
		System.out.println("Area of triangle:"+area);
	}
}
public class AreaaInheritance{
	public static void main(String args[]){
		Triangle t=new Triangle(10,20);
		t.Area();
	}
}			
