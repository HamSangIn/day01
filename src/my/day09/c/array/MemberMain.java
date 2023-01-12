package my.day09.c.array;

public class MemberMain {

	public static void main(String[] args) {

		Member[] mbrArr = new Member[4];
		
		for(int i=0; i<mbrArr.length; i++) {
			System.out.println("mbrArr["+i+"]=> " + mbrArr[i]);
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.passwd = "qWer1234$";
		mbr1.name = "이순신";
	
		Member mbr2 = new Member();
		mbr2.id = "eomJh";
		mbr2.passwd = "qWer1234@";
		mbr2.name = "엄정화";
		
		mbrArr[0] = mbr1;
		mbrArr[1] = mbr2;
	
		for(int i=0; i<mbrArr.length; i++) {
			System.out.println(mbrArr[i].showInfo());
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//end of main-------------------------------------------------------

}
