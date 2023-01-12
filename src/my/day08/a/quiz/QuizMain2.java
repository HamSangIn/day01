package my.day08.a.quiz;

public class QuizMain2 {
	/*


	== 입사문제 == 

	*********1
	********2
	*******3
	******4
	*****5
	****6
	***7
	**8
	*9

	위와같이 나오도록 하세요.
	1. for 문을 사용해서 출력
	2. while 문을 사용해서 출력
	3. do~while 문을 사용해서 출력
	
	*/

	public static void main(String[] args) {

		// 1. for 문을 사용해서 출력
		String a = "*";
		int i;
		int j;
		int k = 9;
		for (i = 0; i < 9; i+=1) {
			for ( j = 0; j < 9-i; j+=1) {
		
					System.out.print(a);
			}
			
			System.out.println(i+1);
			
		}

	    // 2. while 문을 사용해서 출력
		
		while ( i < k) {
			
		
					System.out.print(a);
			
			
			System.out.println(i+1);
			
		}
		
		
		
		
		
		
		
		
		
		
		// 3. do~while 문을 사용해서 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end for main--------------------------------------------------------

}
