package polimorphism05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component		//��ü���� ���������� Ŭ������ ù���� �ҹ��ڷ� ��ü���� ������. �̸��� ������ �� �̸����� ��ü ȣ�� ����
public class SonyTV implements TV {

	@Autowired						//Speaker Ÿ���� ��ü�� Spring Framework���� �˻��ؼ� ���� (DI)
	@Qualifier("speaker2")		//BossSpaeker(speaker) , SonySpeaker(speaker2) <== �� ���� ��ü ��� Speaker Ÿ���� �����ϰ� ����.
	private Speaker speaker; //speaker Ÿ���� ã�Ƽ� �������� , �ߺ� �Ǹ� �浹�Ǽ� ������. (@qualifier) �������̽� Ÿ������ �� ���� : ���������� �������� �ʾƵ� ��
	
	@Override
	public void powerOn() {
		System.out.println("SonyTV - ������ �մϴ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("SonyTV - ������ ���ϴ�.");

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