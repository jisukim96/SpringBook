package polimorphism04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		/* 객체 생성을 Spring Framework 에서 생성 후 DI를 통해서 객체를 주입하는 방식
				1. XML 파일에서 객체를 생성 주입
					src/main/resource : 주로 설정에 관련된 내용을 저장(mybatis 매퍼설정, bean의 xml, db Connection)
						applicationContext.xml		: Bean을 세팅하는 파일, SpringFramework에서 생성
				2.@(어노테이션)을 사용해서 객체를 생성 후 DI(객체를 주입)		<== Spring Boot 사용하는 방식			*/	

		//1. Spring container 를 구동
		AbstractApplicationContext factory = 
					new GenericXmlApplicationContext("applicationContext.xml");	//applicationContext.xml에서 객체 생성한 걸 가져옴
		
		//2. Spring container로 부터 필요한 객체를 Lookup한다.  : DI(객체를 주입)
		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
