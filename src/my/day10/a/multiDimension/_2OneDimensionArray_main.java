package my.day10.a.multiDimension;

public class _2OneDimensionArray_main {

	public static void main(String[] args) {
		
		
		Sungjuk[] sjArr = { new Sungjuk("이순신",90, 80, 70),
							new Sungjuk("엄정화",80, 85, 76),
							new Sungjuk("서강준",85, 70, 90),
							new Sungjuk("이혜리",60, 80, 50)};
				
		 System.out.println("\n=== 학생별 점수 집계 ===\n");
		 System.out.println("---------------------------------------------");
		 System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		 System.out.println("---------------------------------------------");
			 
		 for(int i=0; i<sjArr.length; i++) {
			System.out.println(sjArr[i].showInfo());
			
		}// end of for--------------------------------------------------------
		 int sum_kor = 0, sum_eng = 0, sum_math = 0;
			for(int i=0; i<sjArr.length; i++) {
				
				
				sum_kor = sjArr[i].kor;
				sum_eng = sjArr[i].eng;
				sum_math = sjArr[i].math;
			}// end of for----------------------------------------------------
			double avg_kor = Math.round((double)sum_kor/sjArr.length * 10)/10.0;
			double avg_eng = Math.round((double)sum_eng/sjArr.length * 10)/10.0;
			double avg_math = Math.round((double)sum_math/sjArr.length * 10)/10.0;  
		
			System.out.println("\n==== 과목별 평균 ====\n");
			System.out.println("--------------------------------------------");
			System.out.println("국어   영어   수학");
			System.out.println("--------------------------------------------");
			System.out.println(avg_kor +" "+avg_eng +" "+avg_math);
		

	}// end of main--------------------------------
}
