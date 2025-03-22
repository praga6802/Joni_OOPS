//constructor Overloading

public class Test1{
	
	Test1(){
		System.out.println("no arg constructor");
	}
	
	Test1(int i){
		System.out.println("int arg constructor");
	}

	Test1(double d){
		System.out.println("double arg constructor");
	}
	
	public static void main(String[] args){
		Test1 t1= new Test1();
		Test1 t2= new Test1(1);
		Test1 t3= new Test1(1.5);
	}
}
		