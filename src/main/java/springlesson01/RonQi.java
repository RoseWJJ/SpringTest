package springlesson01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class RonQi {
	public static void main(String[] args) {
//		//��������
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		A a = (A)context.getBean("a");
//		System.out.println(a);
//		B b = (B)context.getBean("springlesson01.B");// ��������û�����ֵĻ�ֻ��ȡ����һ��
////		B b = (B)context.getBean(B.class);//��ֻ����һ��
//		System.out.println(b);
//		//���û��ָ��id���࣬Ĭ�ϵ������� ����#���
//		String [] arr = context.getBeanDefinitionNames();
//		for (String t : arr) {
//			System.out.println(t);
//		}
		
		
		
		
		//FileSystemXmlApplicationContext ���ļ�ϵͳ��Ѱ��xml�ļ� ���̷� 
		//ClassPathXmlApplicationContext ����·������  ����
		//GenericApplicationContext ͨ��  Ĭ�ϲ�����·��
		//WebApplicationContext web.xml��ʵ����
		//�ͽ�ԭ��  ����ApplicationContext ָ�֧���ַ���������ҷ���
		//classpath:  
		//file:
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring.xml");
		A a = (A)context.getBean("a");
		System.out.println(a);
		B b = (B)context.getBean("springlesson01.B");// ��������û�����ֵĻ�ֻ��ȡ����һ��
//		B b = (B)context.getBean(B.class);//��ֻ����һ��
		System.out.println(b);
		//���û��ָ��id���࣬Ĭ�ϵ������� ����#���
		String [] arr = context.getBeanDefinitionNames();
		for (String t : arr) {
			System.out.println(t);
		}
		
	}
}
