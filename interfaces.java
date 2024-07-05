
interface Shape{
	void draw();
//	double area();
}
class rectangle implements Shape{
	public void draw(){
		System.out.println("Hello World");
	}
}
public class interfaces{
	public static void main(String[] args){
		Shape rect = new rectangle();
		rect.draw();
	}
}
