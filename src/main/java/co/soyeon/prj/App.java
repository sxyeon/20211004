package co.soyeon.prj;

import co.soyeon.prj.product.LgTV;
import co.soyeon.prj.product.MyPrint;
import co.soyeon.prj.product.Pencil4B;
import co.soyeon.prj.product.Pencil6B;
import co.soyeon.prj.product.SamsungTV;
import co.soyeon.prj.service.Pencil;
import co.soyeon.prj.service.RemoteControl;
import co.soyeon.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	RemoteControl tv = new SamsungTV();
    //	SamsungTV tv = new SamsungTV(); -> 이렇게 쓰려면 아래에 LgTV 인스턴스도 생성해주어야 한다.
        tv.powerOn();
        tv.powerOff();
        
        tv = new LgTV(); // LgTV로 초기화 .. 인터페이스의 장점 : 코드를 쓰지 않아도 객체 교환 가능
        tv.powerOn();
        tv.powerOff();
        
        Pencil pencil = null;
        pencil = new Pencil4B();
        pencil.selectPencil();
        pencil.pencilInterface(); // Pencil 인터페이스가 가지고 있는 기본 메소드
        
        pencil = new Pencil6B(); // 6B로 초기화
        pencil.selectPencil();
        
        pencil = new Pencil4B(); // 다시 4B로
        pencil.selectPencil();
        
        
//        MyPrint myPrint = new MyPrint();
        
//        myPrint.powerOn();
//        myPrint.selectPencil();
//        myPrint.powerOff();
        
//        RemoteControl rc = new SamsungTV();
//        rc = new LgTV();
        
//        TestInterface ts = new TestInterface(new SamsungTV()); // new SamsungTV가 rc타입이니까
        
//        rc = ts.rcReturn();
//        rc.powerOn();
//        rc.powerOff();
        
//        MyPrint myPrint = new MyPrint(new Pencil4B());
//        myPrint.toPrint();
        
        TryCatchTest trycatchTest = new TryCatchTest();
        try {
			trycatchTest.method1();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("항상 실행하는 구문"); // try가 됐든 catch가 됐는 finally는 무조건 실행함
		}
        
    }
}
