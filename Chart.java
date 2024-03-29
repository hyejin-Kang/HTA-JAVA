package day3.abstraction;

public abstract class Chart {

	//추출된 공통속성
	private String title;
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	 public abstract void draw();
	/*
	 * 추상메소드
	 * -메소드의 구현부가 없는 메소드
	 * -추상클래스와 인터페이스에서만 정의할 수 있다.
	 * -메소드 정의할 때 abstract 키워드를 선언부에 추가한다.
	 * -형식
	 *    접근제한자 abstract 반환타입 메소드명(타입 변수명, 타입변수명 ...);
	 *    
	 *    public abstract void test();
	 * -목적
	 * 		*하위 클래스들이 구현할 메소드에 대한 설계다.
	 * 		*추상메소드가 포함된 클래스를 상속받은 하위클래스(구현클래스)
	 *    	 자신의 상황에 맞게 설계만 되어 있는 메소드를 구체적으로 구현해야 한다.
	 *    	*추상메소드가 포함된 클래스를 상속받은 하위클래스(구현클래스)는 해당 메소드를 반드시 재정의해야 한다.
	 *    	 (구현클래스는 추상클래스를 포함할 수 없기 때문)
	 *    	*추상메소드가 포함된 클래스를 상속받은 하위클래스(구현클래스)는 사용방법이 동일한 구현메소드를 가지게 된다.
	 * 
	 * 추상클래스
	 * -불완전한 설계도
	 * -추상메소드, 구현메소드 둘 다 보유할 수 있다.
	 * -new 연산자를 사용해서 객체 생성할 수 없다.
	 * -클래스를 정의할 때 abstract 키워드를 클래스 선언부에 추가한다.
	 * -형식
	 *   접근 제한자 abstract class 클래스명 { }
	 *  
	 * 구현클래스
	 * -완전한 설계도다.
	 * -구현메소드만 보유할 수 있다.
	 */
	//추출된 공통기능
	
}
