package my.day09.b.array;

import my.util.MyUtil;

public class _1SpaceDeleteMain {

	public static void main(String[] args) {
	
		String str = "  korea   seou l 쌍용 강북 교육센터  ";
		
		System.out.println("시작"+str+"끝");
		
		char[] chArr = str.toCharArray();
		
		/*
	       --------------------------------------------------------------------------------------------------------------------------
	       |' '|' '|'k'|'o'|'r'|'e'|'a'|' '|' '|' '|'s'|'e'|'o'|'u'|' '|'l'|' '|'쌍'|'용'|' '|'강'|'북'|' '|'교'|'육'|'센'|'터'|' '|' '| 
	       --------------------------------------------------------------------------------------------------------------------------    
	   */
		
		str = "";
		for(int i=0; i<chArr.length; i++) {
			if((chArr[i]) !=' '){
				str += chArr[i];
			}
			
		}
		System.out.println("시작"+str+"끝");
		
		str = "  korea   seou l 쌍용 강북 교육센터  ";
		System.out.println("시작"+MyUtil.space_delete(str)+"끝");
		
	}

}
