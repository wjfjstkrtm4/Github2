import java.io.Serializable;

public class Member implements Serializable{
	private String name;
	private String phoneNum;
	private String cardInfo;
	private String passportNum;
	private String pwd;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	Member(String name, String phoneNum, String cardInfo, String passportNum, String pwd){
		this.name = name;
		this.pwd = pwd;
		this.phoneNum = phoneNum;
		this.cardInfo = cardInfo;
		this.passportNum = passportNum;
	}

	public String getPwd() {
		return pwd;
	}
	public String getName1() {
		return name;
	}
	
}