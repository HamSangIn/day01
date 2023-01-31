package my.day16.f.multiInterface;

public interface InterChild extends InterFather, InterMother {
	// 자바는 인터페이스에서는 여러개의 인터페이스를 상속받는 다중상속이 가능하다.
	
	void play();
	// public abstract void play(); 와 같다.
	
}
