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
		//key=value 형태의 데이터를 동록하고 사용할 때는 java.util.Properties 컬렉션 사용

//		for (String address : addressList) {
//			System.out.println(address.toString());
//		}
		
		//Map은 key, value 형태이기 때문에 반복 형태로 쓰려면 List 안에 한 번 더 넣어서 돌려야 함!! 

		factory.close();

	}

}
