package my.day15.b.accessmodifier;

public class Child_1 extends Parent {

/*
    ---------------------------------------------------------------------------------------------------------------------------
	접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	--------------------------------------------------------------------------------------------------------------------------- 
	public                                    O                    O                         O                        O  
	protected                                 O                    O                         O                        X
	default                                   O                    O                         X                        X
	private                                   O                    X                         X                        X
*/	
	
	void viewInfo() {
		super.id = "leess";          // public    동그라미(초록색)  접근가능
		super.passwd = "qwer1234$";  // protected 마름모(노랑색)   접근가능
		super.name = "이순신";         // default   삼각형(파랑색)   접근가능
	//	super.jubun                  // private   사각형(빨강색)   접근불가
	}
	
}
