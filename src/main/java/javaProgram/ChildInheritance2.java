package javaProgram;

public class ChildInheritance2 extends ParentInheritance2 {
	
	public void Model() {
		System.out.println(Model);
	}
	
	public void colour() {
		System.out.println(colour);
	}
	
	public void Gear() {
		System.out.println(Gear);
	}
	
	public static void main(String[] args) {
		
		ChildInheritance2 cd = new ChildInheritance2();
		cd.colour();
		
		ChildInheritance2 gr = new ChildInheritance2();
		gr.Gear();
		
		ChildInheritance2 md = new ChildInheritance2();
		md.Model();
		
		
	}

}
