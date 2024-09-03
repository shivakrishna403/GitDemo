package javaProgram;

public class ParentClass {
	public static void main(String[] args) {
	System.out.println("I navigated to the home page");
	MethodsClass m=new MethodsClass();
	m.Validateheaders();
	
	MethodsClass2 n=new MethodsClass2();
	n.validateFooters();
	
	MethodsClass3 p=new MethodsClass3();
	System.out.println(p.validatepage());
	}

}
