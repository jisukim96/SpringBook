package polimorphism05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component		//객체명을 넣지않으면 클래스명 첫글자 소문자로 객체명이 생성됨. 이름을 넣으면 그 이름으로 객체 호출 가능
public class SonyTV implements TV {

	@Autowired						//Speaker 타입의 객체를 Spring Framework에서 검색해서 주입 (DI)
	@Qualifier("speaker2")		//BossSpaeker(speaker) , SonySpeaker(speaker2) <== 두 개의 객체 모두 Speaker 타입을 내포하고 있음.
	private Speaker speaker; //speaker 타입을 찾아서 주입해줌 , 중복 되면 충돌되서 오류남. (@qualifier) 인터페이스 타입으로 한 이유 : 유지보수시 수정하지 않아도 됨
	
	@Override
	public void powerOn() {
		System.out.println("SonyTV - 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("SonyTV - 전원을 끕니다.");

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
