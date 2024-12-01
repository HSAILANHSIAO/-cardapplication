package controller;

import com.opensymphony.xwork2.ActionSupport;
import service.impl.CardApplicationServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import entity.CardApplication;

public class AddCardApplicationController extends ActionSupport{
	
		private String number;
		private String name;
		private String birthday;
		private String gender;
		private String indentitycard;
		private String address;
		private String phone;
		private String time;
		private String bank;
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBrithday(String brithday) {
			this.birthday = brithday;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getIndentitycard() {
			return indentitycard;
		}
		public void setIndentitycard(String indentitycard) {
			this.indentitycard = indentitycard;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getBank() {
			return bank;
		}
		public void setBank(String bank) {
			this.bank = bank;
		}
		
		private static CardApplicationServiceImpl msi=new CardApplicationServiceImpl();
		ApplicationContext a1=new ClassPathXmlApplicationContext("Sp1.xml");
		
		@Override
		public String execute() throws Exception{
			/*
			 * 1.卡號是否申請過
			 * 2.true-->addCardErroe
			 * 3.addCardSuccess
			 */
			if(msi.findByNumber(getNumber()))
			{
				
				return "addCardError";
			}
			else 
			{
				msi.addCard(new CardApplication(getNumber(),getName(),
						getBirthday(),getGender(),getIndentitycard(),getAddress(),getPhone(),getTime(),getBank()));
				
				return "addCradSuccess";
			}
		}
	
}
