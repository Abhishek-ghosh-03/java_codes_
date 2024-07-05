import java.util.*;
class Animal {
	public void makesound(){
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal{
	@Override
	public void makesound(){
		System.out.println("Dog Sound");
	}
}
class Cat extends Animal{
	@Override
	public void makesound(){
		System.out.println("Cat Sound");
	}
}
public class java_polymorphism{
	/*public int add(int a , int b){
		return a+b;
	}
	public int add(int a , int b ,int c){
		return a+b+c;
	}
	public double add(double a , double b){
		return a+b;
	}
	public static void main(String[] args){
		java_polymorphism pf = new java_polymorphism();
		System.out.println("Adding 2 numbers:"+ pf.add(10,13));
		System.out.println("Adding 3 numbers:"+ pf.add(1,2,3));
		System.out.println(pf.add(10.3,14.7));
	}*/
	public static void main(String[] args){
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.makesound();
		cat.makesound();
	}

}
