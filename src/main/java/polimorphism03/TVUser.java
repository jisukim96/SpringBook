package polimorphism03;

public class TVUser {

	public static void main(String[] args) {

		//클라잉너트 코드 블락 : 외부에서 객체를 생성해서 주입받을 때 수정하지 않아도 됨.
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);		
		//메인메소드 첫번째로 들어오는 객체 -> agrs[0]에 들어옴 
		//new samsung이라는 객체를 만들어 object타입으로 돌려줌 
		
		//인터페이스 메소드 호출
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
