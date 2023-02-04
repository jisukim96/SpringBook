package polimorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser3 {

	public static void main(String[] args) {


		//1. Spring container 를 구동
		AbstractApplicationContext factory = 
					new GenericXmlApplicationContext("applicationContext.xml");	//applicationContext.xml에서 객체 생성한 걸 가져옴
		
		//2. Spring container로 부터 필요한 객체를 Lookup한다.  : DI(객체를 주입)
		TV tv = (TV) factory.getBean("appleTV");	//Bean에서 sonyTV라는 객체 불러옴 sonySpeaker , BossSpeaker는 Speaker타입을 내포하고 있음.
		//appleTV = appleTV와 TV 두가지 타입가지고 있음 TV(인터페이스 타입)으로 바꿔줌 ->유지보수 최소화(약결합)
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
