package polimorphism03;

public class TVUser {

	public static void main(String[] args) {

		//Ŭ���׳�Ʈ �ڵ� ��� : �ܺο��� ��ü�� �����ؼ� ���Թ��� �� �������� �ʾƵ� ��.
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);		
		//���θ޼ҵ� ù��°�� ������ ��ü -> agrs[0]�� ���� 
		//new samsung�̶�� ��ü�� ����� objectŸ������ ������ 
		
		//�������̽� �޼ҵ� ȣ��
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
