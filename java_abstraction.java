/*abstract class shape{
	int a , b;
	abstract void area();
	shape(String name){
		System.out.println("The result:"+ this.objname);
	}
	int perimeter(int a , int b){
		System.out.println("Perimeter of the object: " + (a+b));
		return (a+b);
	}
}
class Square extends shape{
       void area(){
		System.out.println("The area result: ");
	}
}

public class java_abstraction{
	public static void main(String[] args){
		shape s = new Square();
		s.area();
		s.perimeter(3,4);
	}
}*/
/*
abstract class B {
	abstract class C{
		abstract void myAbstract();
	}
}
class D extends B{
	class E extends C{
			void myAbstract(){
				System.out.println("Hello World");
			}
	}
}

public class java_abstraction{
	public static void main(String[] args){
		D outer = new D();
		D.E inner = outer.new E();
		inner.myAbstract();
	}
}*/
abstract class A{
	abstract void m1();
	abstract void m2();
}
abstract class B extends A{
	public void m1(){
		System.out.println("Hello");
	}
}

class C extends B{
	public void m2(){
		System.out.println("World");
	}
}

public class java_abstraction{
	public static void main(String[] args){
		C com = new C();
		com.m1();
		com.m2();
	}
}
