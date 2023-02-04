package polimorphism05;

import org.springframework.stereotype.Component;

@Component("speaker")		// BossSpeaker speaker = new BossSpeaker(); 와 같은 구문 
//Boss Speaker타입 + Speaker타입
public class BossSpeaker implements Speaker {

	@Override
	public void volumeUp() {
		System.out.println("BossSpeaker - 볼륨업 ");
	}

	@Override
	public void volumeDown() {
		System.out.println("BossSpeaker - 볼륨다운 ");
	}

}
