package my.day06.c.For;

public class ForTest2_main {

	public static void main(String[] args) {

		System.out.println(">> 1. break <<");
		
		for(int i=0; i<10; i++) {
			if(i==5) break; //반복문에서 break; 를 만나면 가장 가까운 반복문을 벗어나는 것이다.
			
			System.out.println(i+1);
		}//end of for---------------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int cnt = 0;
		for(;;) { //;;는 무한반복(조건이 없다)
			System.out.println(++cnt + "번째 반복");
			if(cnt == 5) break;//반복문에서 break; 를 만나면 가장 가까운 반복문을 벗어나는 것이다.
			
			
		}
		System.out.println("\n>> 2. continue <<");
		
		// 반복문에서 continue;를 만나면 실행순서가 아래로 내려가지않고 가장 가까운 반복문을 반복한다.
		
		for(int i=0; i<10; i++) {
			
			if((i+1)%2 == 0 )// 출력하고자 하는 값(i+1) 이 짝수이라면
				continue;
			
			System.out.println((i+1)+" ");// 짝수이면 스킵하고 위 컨티뉴로 다시올라간다. 홀수라면 프린트 된후 컨티뉴로 올라간다.
		}//end of for----------------------------------------------
		
		
		
		

	} //end of main()-------------------------------------------

}
