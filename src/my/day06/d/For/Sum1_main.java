package my.day06.d.For;

public class Sum1_main {

	public static void main(String[] args) {

		int sum = 0; // sum 은 누적의 합을 저장시켜주는 변수
		
		// 0+1 == 1번 반복
		// 0+1+2 == 2번 반복
		// 0+1+2+3 == 3번 반복
		// .
		// .
		// .
		//0+1+2+3+4+5+6+7+8+9+10 == 10번 반복
		
		//1+2+3+4+5+6+7+8+9+10 ==> 55
		
		for(int i=1; i<=10; i++) {
			sum +=i; //sum = sum +i; 와 같은말이다.
			
		}
		System.out.println("1부터 10까지의 누적의 합계" + sum);
		//1부터 10까지의 누적의 합계55

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String str ="";
		sum =0; // sum 은 누적의 합을 저장시켜주는 변수
		
		for(int i=1; i<=10; i++) {
			if(i<10)
				str += i + "+";
			else
				str += i;
			
			
			sum += i;
		}//end of for
		
		System.out.println(str + "=" + sum);
		
		// 1+2+3+4+5+6+7+8+9+10
	}// end of main()-----------------------------------------------

}
