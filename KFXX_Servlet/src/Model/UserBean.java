package Model;
/*
 * �û���
 */
public class UserBean {
	private int UserID;//��ͨ�û�ID
	private String UserLoginName;//��ͨ�û���¼��
	private String UserPassword;//��ͨ�û�����
	private String UserName;//��ͨ�û�����
	private String Sex;//��ͨ�û��Ա�
	private String Phone;//��ͨ�û�����
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserLoginName() {
		return UserLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		UserLoginName = userLoginName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
}
