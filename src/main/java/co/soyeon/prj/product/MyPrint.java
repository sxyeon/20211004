package co.soyeon.prj.product;

import co.soyeon.prj.service.Pencil;
import co.soyeon.prj.service.RemoteControl;

public class MyPrint implements RemoteControl, Pencil {

    private Pencil pencil;
    
    public MyPrint(Pencil pencil) {
    	this.pencil = pencil;
    }
    
	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 켠다.");

	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다.");

	}

	@Override
	public void selectPencil() {
		System.out.println("4B");
		
	}
	
	public void toPrint() { // 내가 필요한 매개변수 이렇게 정의할 수 있음
		System.out.println("나는 ");
		pencil.selectPencil();
	}
}
