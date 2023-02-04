package polimorphism04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		/* ��ü ������ Spring Framework ���� ���� �� DI�� ���ؼ� ��ü�� �����ϴ� ���
				1. XML ���Ͽ��� ��ü�� ���� ����
					src/main/resource : �ַ� ������ ���õ� ������ ����(mybatis ���ۼ���, bean�� xml, db Connection)
						applicationContext.xml		: Bean�� �����ϴ� ����, SpringFramework���� ����
				2.@(������̼�)�� ����ؼ� ��ü�� ���� �� DI(��ü�� ����)		<== Spring Boot ����ϴ� ���			*/	

		//1. Spring container �� ����
		AbstractApplicationContext factory = 
					new GenericXmlApplicationContext("applicationContext.xml");	//applicationContext.xml���� ��ü ������ �� ������
		
		//2. Spring container�� ���� �ʿ��� ��ü�� Lookup�Ѵ�.  : DI(��ü�� ����)
		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
