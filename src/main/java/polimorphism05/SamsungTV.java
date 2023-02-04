package polimorphism05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv3")		// SamsungTV tv3 = new SamsungTV();			tv3는 SamsungTV , TV 타입을 내포하고 있다.
public class SamsungTV implements TV {

	@Autowired
	private Speaker speaker;		//객체변수 선언			Speaker를 가져오게끔 객체 변수 선언 해줌
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV - 전원을 켭니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV - 전원을 끕니다.");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
