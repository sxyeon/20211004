package co.soyeon.prj.product;

import co.soyeon.prj.service.RemoteControl;

public class SamsungTV implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("삼성 TV 전원을 켠다.");

	}

	@Override
	public void powerOff() {
		System.out.println("삼성 TV 전원을 끈다.");

	}

}
