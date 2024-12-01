package controller;

import com.opensymphony.xwork2.ActionSupport;

import service.impl.CardApplicationServiceImpl;
import entity.CardApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LoginController extends ActionSupport{
		/**
	 * 
	 */
	private static final long serialVersionUID = -5692907326272558789L;
		private String number;
		private	String indentitycard;
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getIndentitycard() {
			return indentitycard;
		}
		public void setIndentitycard(String indentitycard) {
			this.indentitycard = indentitycard;
		}
		
		//private static CardApplicationServiceImpl csi=new CardApplicationServiceImpl();
		ApplicationContext a1=new ClassPathXmlApplicationContext("Sp1.xml");
		CardApplicationServiceImpl csi=a1.getBean("csi",CardApplicationServiceImpl.class);
		
		@Override
		public String execute() throws Exception
		{
			
			CardApplication c=csi.Login(getNumber(),getIndentitycard());
			
			if(c!=null)
			{
				
				return "loginSuccess";
			}
			else
			{
				return "loginError";
			}
		}
		
}
