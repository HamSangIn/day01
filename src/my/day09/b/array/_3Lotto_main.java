package my.day09.b.array;

import java.util.Random;

public class _3Lotto_main {

	public static void main(String[] args) {
		
		//   1 부터  45 까지의 숫자 중 랜덤하게 6개의 숫자를 추출하도록 한다.
		// 101 부터 145 까지의 숫자 중 랜덤하게 6개의 숫자를 추출하도록 한다.
		
		/*
		     int ball ==>   1    2    3 ....   45
		     int ball ==> 101  102  103 ....  145
		     
		     int[] ballArr = new int[45];
		     
		           ---------------------------------
		 데이터값    | 1 | 2 | 3 | ............ | 45 |
		           ---------------------------------
		 index       0   1   2   ............   44
		 
		           ----------------------------------------
		 데이터값    | 101 | 102 | 103 | ............ | 145 |
		           ----------------------------------------
		 index        0     1      2   ............   44		           
		       
		 */
		
		int[] ballArr = new int[45];
		
		for(int i=0; i<ballArr.length; i++) {
			ballArr[i] = i+1; // 배열의 방마다 데이터값 입력하기
					          // 데이터값은 1 ~ 45
		}
		
		
		int[] tempArr = new int[5]; // 기존에 뽑았던 방번호를 기억시켜두는 저장소
		/*
		           tempArr
		           --------------------------
		 데이터값 => | -1 | -1 | -1 | -1 | -1 |   
		           -------------------------- 
		              0    1    2    3    4
		*/
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = -1; 
		}
		
		
		// 공의 방번호(ballArr 배열의 index)를 꺼내는 작업을 6번 반복
		// 0번 방 부터 44번 방 까지 랜덤하게 6번 뽑아야 한다.
		// 즉, 0 ~ 44 까지 난수를 발생.
		
		Random rnd = new Random();
		
		String result = "";
		
		outer:
		for(int i=0; i<6; i++) {
		
			int idx = rnd.nextInt(44 - 0 + 1) + 0; // 0 ~ 44
	   //   i => 0  1  2  3  3   4   5
	   // idx => 2  5  0  5  7  10  20
       //                (꽝)			          
		
			
			for(int j=0; j<tempArr.length; j++) {
				
				if(idx == tempArr[j]) {
					// 새로이 뽑아온 방번호(idx)가 기본에 뽑은것(tempArr[j])과 같다라면 다시 새로이 뽑아야 한다.  
				    i--;
					continue outer;
				}
				
			}// end of for------------------
			
			if(i<5) {
				tempArr[i] = idx;
				// 뽑은 방번호(index 번호)를 저장시켜둔다.
				
				/*
				           tempArr
				           --------------------------
				 데이터값 => | 2 | 5 | 0 | -1 | -1 |   
				           -------------------------- 
				             0    1    2    3    4
				*/
			}
			
			String str_add = (i<5)?",":"";
			result += ballArr[idx]+str_add;
			
		}// end of for---------------------
		
        System.out.println("\n로또 1등 당첨번호 : " + result);	
        

	}// end of main()----------------------------

}
