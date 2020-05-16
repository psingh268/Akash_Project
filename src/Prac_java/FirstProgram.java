package Prac_java;

public class FirstProgram {
	
	int a = 15;
	int b = 10;
	
	public void add()
	{
		int c = a + b;
		System.out.println(c);
	}
	public void subtract()
	{
		int d = a - b;
		System.out.println(d);
	
	}
	
	

	public static void main(String[] args) {
		
		FirstProgram obj = new FirstProgram();
		obj.add();
		obj.subtract();
		System.out.println(obj.a);
	}

}
