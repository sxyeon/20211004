package co.soyeon.prj.product;

import co.soyeon.prj.service.RemoteControl;

public class LgTV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("LG TV 전원을 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV 전원을 끈다.");
		
	}

}
