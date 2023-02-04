package polimorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser2 {

	public static void main(String[] args) {


		//1. Spring container �� ����
		AbstractApplicationContext factory = 
					new GenericXmlApplicationContext("applicationContext.xml");	//applicationContext.xml���� ��ü ������ �� ������
		
		//2. Spring container�� ���� �ʿ��� ��ü�� Lookup�Ѵ�.  : DI(��ü�� ����)
		TV tv = (TV) factory.getBean("sonyTV");	//Bean���� sonyTV��� ��ü �ҷ��� sonySpeaker , BossSpeaker�� SpeakerŸ���� �����ϰ� ����.
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
