package my.day10.a.multiDimension;

public class TwoDimentionArray_main1 {

	public static void main(String[] args) {
	
	// === 1차원 배열 ===
	int[] subjectArr = new int[5]; // 1행 5열
	
	/*
	 
	  			--------------------
	 			| 0 | 0 | 0 | 0 | 0 |
	  			--------------------
	  
	  index =>    0   1   2   3   4 
	 */
		
	// === 2차원 배열 ===
	int[][] pointArr = new int[4][3]; // 4행 3열
/*
  	데이터 값
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	
  	index
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	| 0 | 0 | 0 |
  	-------------
  	
  	
  */	
	
	pointArr[0][0] = 10;
	pointArr[0][1] = 20;
	pointArr[0][2] = 30;
	
	pointArr[1][0] = 40;
//	pointArr[1][1] = 50;
	pointArr[1][2] = 60;
	
//	pointArr[2][0] = 0;
//	pointArr[2][1] = 0;
//	pointArr[2][2] = 0;
	
	pointArr[3][0] = 100;
	pointArr[3][1] = 110;
	pointArr[3][2] = 120;

	
	/*
  	데이터 값
  	-------------------
  	| 10  | 20  |  30 |
  	-------------------
  	| 40  |  0  |  60 |
  	-------------------
  	|  0  |  0  |  0  |
  	-------------------
  	| 100 | 110 | 120 |
  	-------------------
	*/
	
	System.out.println("pointArr.length => " + pointArr.length);
	// pointArr.length => 4
	// 2차원배열명.length은 행의 길이가 나온다.
	System.out.println("pointArr.length[0] => " + pointArr[0].length);
	// pointArr[0].length => 3
	// 2차원배열명[행인덱스].length 은 그 행에 존재하는 열의 길이가 나온다.
	
	System.out.println("pointArr.length[1] => " + pointArr[1].length);
	System.out.println("pointArr.length[2] => " + pointArr[2].length);
	System.out.println("pointArr.length[3] => " + pointArr[3].length);
	
	System.out.println("\n=============================================\n");
	
	for(int i=0;i<pointArr.length;i++) { // 행
		
		for(int j=0;j<pointArr[i].length;j++) { // 열
			System.out.print(pointArr[i][j]+"\t");
		}
		System.out.println();
		
	} // end of for -----------------------------------------------------
	
	System.out.println("\n----------------------------------------------\n");
	
	for(int i=0;i<pointArr.length;i++) { // 행
		
		for(int j=0;j<pointArr[i].length;j++) { // 열
			System.out.printf("%4d",pointArr[i][j]);
		}
		System.out.println();
		
	} // end of for -----------------------------------------------------
	
	System.out.println("\n----------------------------------------------\n");
	
	
	for(int i=0;i<pointArr.length;i++) { // 행
		
		for(int j=0;j<pointArr[i].length;j++) { // 열
			String str_add = (j<pointArr[i].length - 1)?"\t" : "\n";
			System.out.printf("%3d%s",pointArr[i][j],str_add);
		}
		System.out.println();
		
	} // end of for -----------------------------------------------------
	/*
	 
	 	10   20   30
	    40    0   60
	     0    0    0
	   100  110  120 
	 
    */
	
	System.out.println("\n============= 성적결과 =============\n");
	
	// 국어 영어 수학
	int[][] jumsuArr = {
						 {90, 80, 70},	// 이순신
						 {80, 85, 76},	// 엄정화
						 {85, 70, 90},	// 서강준
						 {60, 80, 50}	// 이혜리
					   };
	// 1. 각 학생별로 총점을 나타내어 보자.
	for(int i=0; i < jumsuArr.length;i++) {
		int sum = 0;
		for(int j=0; j < jumsuArr[i].length;j++) {
			sum += jumsuArr[i][j];
		}		
		System.out.println(sum);
	}
	/*
	 240
	 241
	 245
	 190 
	  
	  */
	
	// 2. 각 과목별로 총점을 나타내어 보자.
	int row = jumsuArr.length; // 행의 갯수 4
	int col = jumsuArr[0].length; // 열의 갯수 3
	System.out.println("과목별 총점");
	
	for(int i = 0; i < col; i++ ) { // 3번 반복 → 열의 갯수만큼 반복
		int sum = 0;
		for(int j = 0; j < row; j++) { // 4번 반복 → 행의 갯수만큼 반복
			sum += jumsuArr[j][i]; // [0,0] , [1,0], [2,0], [3,0]과 같이 행이 움직여야 하기때문에 [j][i]
		}// end of for -----------------------------------
		System.out.println(sum);
	}// 
	/*
	 	315
	    315
	    286
	 */
		
	System.out.println("\n==================================================\n");
	
	String[] nameArr = {"이순신","엄정화","서강준","이혜리"};
	String[] sub_name_Arr = {"국어","영어","수학"};
	
	int sum = 0;
	double avg = 0;
	
	System.out.println("=== 학생별 총점 ===");
	for (int i = 0; i < jumsuArr.length; i++) {
		sum = 0;
		System.out.print((i + 1) + ". " + nameArr[i] + " : ");
		for (int j = 0; j < jumsuArr[i].length; j++) {
			sum += jumsuArr[i][j];
		}
		System.out.println(sum);
	}

	/*
	 	=== 학생별 총점 ===
	 	1. 이순신 : 240
	 	2. 엄정화 : 241
	 	3. 서강준 : 245
	 	4. 이혜리 : 190
	*/
	
	/*
	 	==== 학생별 점수 집계 ====
	 	-----------------------------------
	 	학생명    국어   영어   수학   총점   평균
	 	-----------------------------------
	 	이순신    90    80    70   240   80.0 	평균은 반올림
	 	엄정화	80	  85    76   241   80.3   
	 	서강준    85    70    90   245   81.7
	 	이혜리    60    80    50   190   63.3
	  */
	
	System.out.println();
	
	System.out.println("========== 학생별 점수 집계 ===========");
	System.out.println("----------------------------------");
	System.out.print("학생명  ");
	for (int i = 0; i < sub_name_Arr.length; i++) {
		System.out.printf("%-5s", sub_name_Arr[i]);
	}
	System.out.print("총점   평균\n");
	System.out.println("----------------------------------");

	for (int i = 0; i < jumsuArr.length; i++) { // 4번 반복

		System.out.print(nameArr[i] + "   ");
		sum = 0;
		for (int j = 0; j < jumsuArr[i].length; j++) {
			System.out.printf("%-5s", jumsuArr[i][j]);
			sum += jumsuArr[i][j];
		}
		avg = Math.round(((double) sum / 3) * 10) / 10.0;
		System.out.printf("%-5s %-5s\n", sum, avg);

	}

	} // end of main() --------------------------------------

}
