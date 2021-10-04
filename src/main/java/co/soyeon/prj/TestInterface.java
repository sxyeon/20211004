package co.soyeon.prj;

import co.soyeon.prj.service.RemoteControl;

public class TestInterface {
	private RemoteControl rc; 
	
	public TestInterface(RemoteControl rc) {
		this.rc = rc;
	}
	
	public String toString() {
		rc.powerOn();
		rc.powerOff();
		return null;
	}
	
	public RemoteControl rcReturn() { // RemoteControl타입으로 받은 rc를 return해줌
		return rc;
	}

}
