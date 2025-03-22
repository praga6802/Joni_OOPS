class Test50{
	
	Test50(){
		this(10);
		System.out.println("No arg constructor");
	}
	
	Test50(int i){
		System.out.println("int arg constructor");
	}
	
	Test50(double d){
		this();
		System.out.println("double arg constructor");
	}

	public static void main(String[] args){
		Test50 t= new Test50(10.5);
	}
}