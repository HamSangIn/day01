package my.day15.d.polymorphism;

public class Animal {

	// Dog, Cat, Duck 의 공통 field (추상화)
	private String name;
	private int birthYear;
	
	// Dog, Cat, Duck 의 공통 method(기능) (추상화)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if( name != null && !name.trim().isEmpty() )
			this.name = name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		if(birthYear > 0)
			this.birthYear = birthYear;
	}
	
	// === 동물들(강아지, 고양이, 오리)의 정보를 출력해주는 메소드 === //
	protected void showInfo() {
		System.out.println("== 동물정보 ==\n"
				        + "1. 성명 : " + name + "\n"
				        + "2. 생년 : " + birthYear + "년 \n");
	}
	
	
	protected void cry() {
		System.out.println(">>> 동물들이 소리를 냅니다. <<<");
	}
	
	
	
}
