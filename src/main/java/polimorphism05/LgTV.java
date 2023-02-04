package polimorphism05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv2")			//LgTV tv2 = new Lgtv2( ); 와 같은 구문
public class LgTV implements TV {

	@Autowired		//speaker 타입의 객체를 찾아서 speaker 타입의 객체 변수에 주입시켜줌
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원을 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원을 끕니다.");

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
