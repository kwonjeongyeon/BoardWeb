package injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		CollectionBean bean = (CollectionBean) factory.getBean("CollectionBean");
		// List<String> addressList = bean.getAddressList();
		// Set<String> addressList = bean.getAddressList();
		//Map<String, String> addressList = bean.getAddressList();
		Properties addressList = bean.getAddressList();
		//key=value ������ �����͸� �����ϰ� ����� ���� java.util.Properties �÷��� ���

//		for (String address : addressList) {
//			System.out.println(address.toString());
//		}
		
		//Map�� key, value �����̱� ������ �ݺ� ���·� ������ List �ȿ� �� �� �� �־ ������ ��!! 

		factory.close();

	}

}
