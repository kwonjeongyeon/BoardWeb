package polymorphism;

public class BeanFactory {
	//������ ���� ���Ͽ� ��ϵ� <bean>��ü�� �����ϰ� �����ϴ� �⺻���� �����̳� ��ɸ� ����
	//Ŭ���̾�Ʈ�� ��û(lookup)�� ���ؼ��� <bean>��ü�� �����Ǵ� ���� �ε� ��� ���

	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}

}

//TV�� ��ü�� �� Ŭ���̾�Ʈ �ҽ��� �������� �ʰ� TV�� ��ü�� �� �ֵ��� Factory ���� ����
// Factory ������ Ŭ���̾�Ʈ���� ����� ��ü ������ ĸ��ȭ�Ͽ� TVUser�� TV ���̸� ������ ���� ���·� ������ش�.
//Bean Factory�� getBean() �޼ҵ�� �Ű������� ���� beanName�� �ش��ϴ� ��ü�� �����Ͽ� ����