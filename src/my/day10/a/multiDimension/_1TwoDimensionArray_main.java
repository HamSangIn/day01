package my.day10.a.multiDimension;

public class _1TwoDimensionArray_main {

	public static void main(String[] args) {
		
		// === 1차원 배열 ===
		int[] subjectArr = new int[5];  // 1행 5열
	/*
	            ---------------------
	            | 0 | 0 | 0 | 0 | 0 |
	            ---------------------
	  index ==>   0   1   2   3   4   	
	*/
		
		// === 2차원 배열 ===
		int[][] pointArr = new int[4][3]; // 4행 3열
	/*
	     데이터값
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
	     ----------------------------
	     | [0][0] | [0][1] | [0][2] | 
	     ----------------------------
	     | [1][0] | [1][1] | [1][2] | 
	     ----------------------------
	     | [2][0] | [2][1] | [2][2] | 
	     ----------------------------
	     | [3][0] | [3][1] | [3][2] | 
	     ----------------------------
	 */
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
		 
	/*	 
		 데이터값
	     -------------------
	     | 10  | 20  | 30  | 
	     -------------------
	     | 40  | 0   | 60  | 
	     -------------------
	     |  0  | 0   | 0   | 
	     -------------------
	     | 100 | 110 | 120 | 
	     -------------------
	*/	
		 
		 System.out.println("pointArr.length => " + pointArr.length);
		 // pointArr.length => 4
		 // 2차원배열명.length 은 행의길이가 나온다.
		 
		 System.out.println("pointArr[0].length => " + pointArr[0].length);
		 // pointArr[0].length => 3
		 // 2차원배열명[행인덱스].length 은 그 행에 존재하는 열의 길이가 나온다. 
		 
		 System.out.println("pointArr[1].length => " + pointArr[1].length);
		 // pointArr[1].length => 3
		 
		 System.out.println("pointArr[2].length => " + pointArr[2].length);
		 // pointArr[2].length => 3
		 
		 System.out.println("pointArr[3].length => " + pointArr[3].length);
		 // pointArr[3].length => 3
		 
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 for(int i=0; i<pointArr.length; i++) {   // 행
		 
			 for(int j=0; j<pointArr[i].length; j++) { // 열 
				 System.out.print( pointArr[i][j] + "\t" );
			 }
			 System.out.print("\n");
		 }// end of for--------------------------
	/*
	      10  20  30 
	      40  0   60
	      0   0   0 
	      100 110 120  	 
	 */
		 
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 for(int i=0; i<pointArr.length; i++) {   // 행
		 
			 for(int j=0; j<pointArr[i].length; j++) { // 열 
				 String str_add = (j<pointArr[i].length-1)?"\t":"\n";
				 System.out.printf("%3d%s", pointArr[i][j], str_add);
			 }
		 }// end of for--------------------------
	   /*
	         10	 20	 30
			 40	  0	 60
			  0	  0	  0
			100	110	120
	   */
		 
		 System.out.println("\n====== 성적결과 ======\n");
		 
		                    // 국어 영어 수학
		 int[][] jumsuArr = { {90, 80, 70}, // 이순신
				              {80, 85, 76}, // 엄정화
				              {85, 70, 90}, // 서강준
				              {60, 80, 50}  // 이혜리
		                    };
		 
		 // 1. 각 학생별로 총점을 나타내어 보자.
		 for(int i=0; i<jumsuArr.length; i++) {
			 
			 int sum = 0;
			 for(int j=0; j<jumsuArr[i].length; j++) {
				 sum += jumsuArr[i][j];
			 }// end of for--------------
			 
			 System.out.println(sum);
			 /*
			    240
				241
				245
				190 
			  */
			 
		 }// end of for-------------------
		 
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		// 2. 각 과목별로 총점을 나타내어 보자.
		for(int i=0; i<jumsuArr[0].length; i++)  {  // 3
		  
			int sum = 0;
			for(int j=0; j<jumsuArr.length; j++) {  // 4 
				sum += jumsuArr[j][i];
			}// end of for---------------
			
			System.out.println(sum);
		}// end of for--------------------	
		/*
		    315
		    315
		    286  
		*/
		
		System.out.println("\n=================================\n");
		
		String[] nameArr = {"이순신","엄정화","서강준","이혜리"};
		
		System.out.println("\n=== 학생별 총점 ===");
		
		for(int i=0; i<jumsuArr.length; i++) {
			
			int sum = 0;
			for(int j=0; j<jumsuArr[i].length; j++) {
				sum += jumsuArr[i][j];
			}// end of for---------------------
			
			System.out.println( (i+1)+"."+nameArr[i] + " : " + sum);
		}// end of for-------------------------
		
		/*
		    === 학생별 총점 ===
		    1.이순신 : 240
		    2.엄정화 : 241
		    3.서강준 : 245
		    4.이혜리 : 190 
		*/
		
		
		System.out.println("\n==== 학생별 점수 집계 =====\n");
		System.out.println("--------------------------------------------");
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<jumsuArr.length; i++) {
			
			String str = "";
			str += nameArr[i];
			
			int sum = 0;
			for(int j=0; j<jumsuArr[i].length; j++) {
				str += "\t"+jumsuArr[i][j];
				sum += jumsuArr[i][j];
			}// end of for---------------------
			
			str += "\t"+sum+"\t"+( Math.round(sum/3.0*10)/10.0);
			
			System.out.println(str);
		}// end of for-------------------------
		
		/*
		    ==== 학생별 점수 집계 =====
		    
		    ---------------------------------
		     학생명   국어  영어  수학  총점  평균 
		    ---------------------------------
		     이순신   90   80   70   240  80.0 
		     엄정화   80   85   76   241  80.3
		     서강준   85   70   90   245  81.7
		     이혜리   60   80   50   190  63.3
		*/
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
		    ==== 과목별 평균 ====
		     
		    ------------------
		     국어   영어   수학
		    ------------------
		     78.7  78.7  71.5
		 */
		
		
		
		String re="";
		for(int i=0; i<jumsuArr[0].length; i++)  {  // 3
			
			int sum = 0;
			for(int j=0; j<jumsuArr.length; j++) {  // 4 
				sum += jumsuArr[j][i];
				
				
		
			
			
			}// end of for---------------
			re += Math.round((double)sum/jumsuArr.length*10)/10.0+" ";
			System.out.println("\n==== 과목별 평균 ====\n");
			System.out.println("--------------------------------------------");
			System.out.println("국어 영어 수학");
			System.out.println("--------------------------------------------");
			System.out.println(re);
			
			
		}
		
		
		
		
		
	}// end of main()----------------------------------

}
