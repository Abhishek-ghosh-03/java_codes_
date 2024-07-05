class encapsulate {
	private String name;
	public static int number = 15;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
public class java_encapsulation{
	public static void main(String[] args){
		encapsulate n = new encapsulate();
		n.setName("Abhishek");
		System.out.println("The Name: "+n.getName() + " Age :"+ encapsulate.number);
	}
}
