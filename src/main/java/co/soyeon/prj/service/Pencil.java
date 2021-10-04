package co.soyeon.prj.service;

public interface Pencil {
	void selectPencil(); // 인터페이스는 함수 원형만 존재하는 것
	
	default void pencilInterface() {
		System.out.println("나는 인터페이스 객체다."); 
		// default 키워드는 인터페이스에서만 사용 가능
		
	}

}
