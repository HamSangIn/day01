package my.day16.f.multiInterface;

public class MainChild {

	public static void main(String[] args) {
		
		Child cd = new Child();
		cd.work();
		cd.cook();
		cd.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~\n");
		
		InterFather infather = new Child();
		infather.work();
		
		InterMother inmother = new Child();
		inmother.cook();
		
		System.out.println("\n====================\n");
		
		InterChild inchild = new Child();
		inchild.work();
		inchild.cook();
		inchild.play();

	}

}
