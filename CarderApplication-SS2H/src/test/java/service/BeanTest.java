package service;





import service.impl.CardApplicationServiceImpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.CardApplication;



public class BeanTest {

		//private static CardApplicationServiceImpl csi=new CardApplicationServiceImpl();
		private ApplicationContext a1=new ClassPathXmlApplicationContext("Sp1.xml");
		CardApplicationServiceImpl csi=a1.getBean("csi",CardApplicationServiceImpl.class);
	
		@Test
		public void addCardTest()
		{
			csi.addCard(new CardApplication("a009", "李依", "0815", "女", "e1050","台北", "09800", "1200", "中華分行"));
			
			System.out.println("success");
			
		}
		
		//@Test
		public void LoginTest()
		{
			System.out.println(csi.Login("a006", "a001"));
		}
		
		//@Test
		public void finbByUsernameTest()
		{
			System.out.println(csi.findByNumber("a006"));
			
		}
		
		
}
