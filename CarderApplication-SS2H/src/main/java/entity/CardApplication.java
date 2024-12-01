package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cardapplication")
public class CardApplication {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private	String number;
	private String name;
	private String birthday;
	private String gender;
	private String indentitycard;
	private String address;
	private String phone;
	private String time;
	private String bank;
	public CardApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardApplication(String number, String name, String birthday, String gender, String indentitycard,
			String address, String phone, String time, String bank) {
		super();
		this.number = number;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.indentitycard = indentitycard;
		this.address = address;
		this.phone = phone;
		this.time = time;
		this.bank = bank;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public void setBirthday(String birthday) {
		this.birthday = birthday;
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
	
	                                                                                                                         
	
}
