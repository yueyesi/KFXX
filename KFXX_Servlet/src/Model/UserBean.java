package Model;
/*
 * 用户类
 */
public class UserBean {
	private int UserID;//普通用户ID
	private String UserLoginName;//普通用户登录名
	private String UserPassword;//普通用户密码
	private String UserName;//普通用户姓名
	private String Sex;//普通用户性别
	private String Phone;//普通用户号码
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
