package polimorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser3 {

	public static void main(String[] args) {


		//1. Spring container �� ����
		AbstractApplicationContext factory = 
					new GenericXmlApplicationContext("applicationContext.xml");	//applicationContext.xml���� ��ü ������ �� ������
		
		//2. Spring container�� ���� �ʿ��� ��ü�� Lookup�Ѵ�.  : DI(��ü�� ����)
		TV tv = (TV) factory.getBean("appleTV");	//Bean���� sonyTV��� ��ü �ҷ��� sonySpeaker , BossSpeaker�� SpeakerŸ���� �����ϰ� ����.
		//appleTV = appleTV�� TV �ΰ��� Ÿ�԰����� ���� TV(�������̽� Ÿ��)���� �ٲ��� ->�������� �ּ�ȭ(�����)
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
