package polimorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		/* 객체 생성을 Spring Framework 에서 생성 후 DI를 통해서 객체를 주입하는 방식
				1. XML 파일에서 객체를 생성 주입
					src/main/resource : 주로 설정에 관련된 내용을 저장(mybatis 매퍼설정, bean의 xml, db Connection)
						applicationContext.xml		: Bean을 세팅하는 파일, SpringFramework에서 생성
				2.@(어노테이션)을 사용해서 객체를 생성 후 DI(객체를 주입)		<== Spring Boot 사용하는 방식			

					a. @(어노테이션)을 사용할 수 있도록 설정이 필요함.
						applicationContext.xml : Bean 구성 파일 , 어노테이션을 사용할 수 있도록 설정 필요. (context 등록)
							<context:component-scan base-package="polimorphism05"></context:component-scan>
							<context:component-scan base-package="com.spring"></context:component-scan>

					b. 클래스 위에 @Component 어노테이션을 붙여서 객체를 생성 <-- 클래스 외부에서 할당
							다양한 종류의 클래스가 존재하기 때문에 클래스의 종류에 따라서 여러 이름으로 어노테이션을 붙임.
						@Component  	: 일반적인 클래스를 Bean (객체화) 생성
						@Service 			: 비지니스 로직을 처리하는 클래스에 Bean 생성 
						@Repasitory		: 데이터 베이스 연동을 처리하는 DAO 클래스에 생성
						@Controller		: 사용자 요청을 Controller 클래스에 붙여주는
						클래스 - 첫글자 대문자, 객체-대문자X
					c. Spring Framework에서 생성된 객체를 의존성 주입(DI)하는 어노테이션 ( 클래스 변수 위에 할당)
							클래스 내부에서 클래스 변수에 할당.
						@Autowired	: 해당 타입의 객체를 찾아서 자동으로 할당하는 어노테이션 ,
														해당 타입의 객체가 여러개 존재할 경우 오류가 발생
						@Qualifier		: 특정 객체 이름을 사용해서 불러오는 것 , @Autowired와 같이 사용 함
						
						@Inject			: 자바에서 제공되는 어노테이션 , @Autowired와 동일한 어노테이션(타입으로 객체를 가지고 온다.)
						@Resource		: 자바에서 제공되는 어노테이션,  <= 타입이 아닌 이름으로 객체 식별
											@Autowierd + @Qualifier를 하나로 사용함.
					
					클래스 내부에서 객체를 가져오는 기능 @Autowired: 타입으로 객체 찾아옴 @Qualifier : 특정이름을 사용해서 불러옴
							
		*/
		//1. Spring container 를 구동
		AbstractApplicationContext factory = 
					new GenericXmlApplicationContext("applicationContext.xml");	//applicationContext.xml에서 객체 생성한 걸 가져옴
		
		//2. Spring container로 부터 필요한 객체를 Lookup한다.  : DI(객체를 주입)
		TV tv = (TV) factory.getBean("tv3");	//Bean에서 tv2라는 객체 불러옴
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
