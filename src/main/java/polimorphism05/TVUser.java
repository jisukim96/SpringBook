package polimorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		/* ��ü ������ Spring Framework ���� ���� �� DI�� ���ؼ� ��ü�� �����ϴ� ���
				1. XML ���Ͽ��� ��ü�� ���� ����
					src/main/resource : �ַ� ������ ���õ� ������ ����(mybatis ���ۼ���, bean�� xml, db Connection)
						applicationContext.xml		: Bean�� �����ϴ� ����, SpringFramework���� ����
				2.@(������̼�)�� ����ؼ� ��ü�� ���� �� DI(��ü�� ����)		<== Spring Boot ����ϴ� ���			

					a. @(������̼�)�� ����� �� �ֵ��� ������ �ʿ���.
						applicationContext.xml : Bean ���� ���� , ������̼��� ����� �� �ֵ��� ���� �ʿ�. (context ���)
							<context:component-scan base-package="polimorphism05"></context:component-scan>
							<context:component-scan base-package="com.spring"></context:component-scan>

					b. Ŭ���� ���� @Component ������̼��� �ٿ��� ��ü�� ���� <-- Ŭ���� �ܺο��� �Ҵ�
							�پ��� ������ Ŭ������ �����ϱ� ������ Ŭ������ ������ ���� ���� �̸����� ������̼��� ����.
						@Component  	: �Ϲ����� Ŭ������ Bean (��üȭ) ����
						@Service 			: �����Ͻ� ������ ó���ϴ� Ŭ������ Bean ���� 
						@Repasitory		: ������ ���̽� ������ ó���ϴ� DAO Ŭ������ ����
						@Controller		: ����� ��û�� Controller Ŭ������ �ٿ��ִ�
						Ŭ���� - ù���� �빮��, ��ü-�빮��X
					c. Spring Framework���� ������ ��ü�� ������ ����(DI)�ϴ� ������̼� ( Ŭ���� ���� ���� �Ҵ�)
							Ŭ���� ���ο��� Ŭ���� ������ �Ҵ�.
						@Autowired	: �ش� Ÿ���� ��ü�� ã�Ƽ� �ڵ����� �Ҵ��ϴ� ������̼� ,
														�ش� Ÿ���� ��ü�� ������ ������ ��� ������ �߻�
						@Qualifier		: Ư�� ��ü �̸��� ����ؼ� �ҷ����� �� , @Autowired�� ���� ��� ��
						
						@Inject			: �ڹٿ��� �����Ǵ� ������̼� , @Autowired�� ������ ������̼�(Ÿ������ ��ü�� ������ �´�.)
						@Resource		: �ڹٿ��� �����Ǵ� ������̼�,  <= Ÿ���� �ƴ� �̸����� ��ü �ĺ�
											@Autowierd + @Qualifier�� �ϳ��� �����.
					
					Ŭ���� ���ο��� ��ü�� �������� ��� @Autowired: Ÿ������ ��ü ã�ƿ� @Qualifier : Ư���̸��� ����ؼ� �ҷ���
							
		*/
		//1. Spring container �� ����
		AbstractApplicationContext factory = 
					new GenericXmlApplicationContext("applicationContext.xml");	//applicationContext.xml���� ��ü ������ �� ������
		
		//2. Spring container�� ���� �ʿ��� ��ü�� Lookup�Ѵ�.  : DI(��ü�� ����)
		TV tv = (TV) factory.getBean("tv3");	//Bean���� tv2��� ��ü �ҷ���
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
