package my.day10.a.multiDimension;

public class _3TwoDimensionArray_main {

	public static void main(String[] args) {
		
		
		// === 2차원 배열 ===
		int[][] pointArr = new int[4][]; // 4행 null열
	/*
		 // 열의 크기를 설정하지 않았으므로 NullPointerException 발생함.
		  
		 pointArr[0][0] = 10;
		 pointArr[0][1] = 20;
		 pointArr[0][2] = 30;
		 
		 pointArr[1][0] = 40;
	//	 pointArr[1][1] = 50;
		 pointArr[1][2] = 60;
		 
	//	 pointArr[2][0] = 70;
	//	 pointArr[2][1] = 80;
	//   pointArr[2][2] = 90;
		 
		 pointArr[3][0] = 100;
		 pointArr[3][1] = 110;
		 pointArr[3][2] = 120;
	*/ 
		 pointArr[0] = new int[3]; // 0행은 3열로 설정함.
		 pointArr[1] = new int[2]; // 1행은 2열로 설정함.
		 pointArr[2] = new int[4]; // 2행은 4열로 설정함.
		 pointArr[3] = new int[3]; // 3행은 3열로 설정함.
		 
		 pointArr[0][0] = 10;
		 pointArr[0][1] = 20;
		 pointArr[0][2] = 30;
		 
		 pointArr[1][0] = 40;
		 pointArr[1][1] = 50;
//	     pointArr[1][2] = 60; //ArrayIndexOutOfBoundsException 이 발생함 (1행은 2열이끝인데 3열방이 있으면안됨)
		 
		 pointArr[2][0] = 70;
		 pointArr[2][1] = 80;
		 pointArr[2][2] = 90;
		 pointArr[2][3] = 90;
		 
	 /*
	     데이터값
	     -------------
	     | 0 | 0 | 0 | 
	     -------------
	     | 0 | 0 |
	     -----------------
	     | 0 | 0 | 0 | 0 |
	     -----------------
	     | 0 | 0 | 0 | 
	     -------------
	
	
	     index
	     ----------------------------
	     | [0][0] | [0][1] | [0][2] | 
	     ----------------------------
	     | [1][0] | [1][1] | 
	     -------------------------------------
	     | [2][0] | [2][1] | [2][2] | [2][3] | 
	     -------------------------------------
	     | [3][0] | [3][1] | [3][2] | 
	     ----------------------------
	     
	     
	     데이터값
	     ----------------
	     | 10 | 20 | 30 | 
	     ----------------
	     | 40 | 50 |
	     ----------------------
	     | 70 | 80 | 90 | 100 |
	     ----------------------
	     | 0 | 0 | 0 | 
	     -------------
	 */
		 for(int i=0; i<pointArr.length; i++) {// 행
			 for(int j=0; j<pointArr[i].length; j++) {// 열
				 String str_add =(j<pointArr[i].length-1)?"\t":"\n";// 맨마지막이 아니라면 탭 그뒤는 줄바꿈
			 System.out.printf("%3d%s", pointArr[i][j], str_add);
			 }
		 }// end of for--------------------------
		 
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 int[][] numArr = {{10,20,30},
			 			   {40,50},
		 				   {70,80,90,100},
	 					   {0,0,0}};
		 for(int i=0; i<numArr.length; i++) {// 행
			 for(int j=0; j<numArr[i].length; j++) {// 열
				 String str_add =(j<numArr[i].length-1)?"\t":"\n";// 맨마지막이 아니라면 탭 그뒤는 줄바꿈
			 System.out.printf("%3d%s", numArr[i][j], str_add);
			 }
		 }// end of for--------------------------
		 
		 
		 
		 System.out.println("\n== 프로그램 종료 ==");
		 
		
		
	}// end of main()----------------------------------

}
