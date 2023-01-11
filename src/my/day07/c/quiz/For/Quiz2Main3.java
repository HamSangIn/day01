package my.day07.c.quiz.For;

public class Quiz2Main3 {

	public static void main(String[] args) {
		
		
		
	
		String ti = "";
		System.out.println(">>> for문을 이용하여 알파벳 출력 <<<");
		String s = "";
       
		for(char i='a'; i<='z'; i++) {
	
			s += i +"";
		}
	
        String[] tii = s.split(" ",-1);

        for(int i=0;i<tii.length;i++){
            for(int j=0;j<tii[i].length();j++) {
            	ti += (j%2==0? tii[i].substring(j,j+1).toUpperCase()
            		: tii[i].substring(j,j+1).toLowerCase()); 
            }
		
		}	
    	System.out.print(ti);
	}
}
