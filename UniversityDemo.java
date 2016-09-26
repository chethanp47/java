package in.ac.kletech;

public class UniversityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University BVB=new University("E30");
		University kletech=new University("E241");
		System.out.println("***** BVB : E30 *****");
		BVB.createobject();
		BVB.calculate();
		System.out.println("\n\n\n");
		System.out.println("***** KLETECH : E241 *****");
		kletech.createobject1();
		kletech.calculate1();
		

	}

}
