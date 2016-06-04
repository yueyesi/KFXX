package Model;
/*
 * 管理员类
 */
public class AdministratorBean {
		private int AdministratorID;//管理员ID
		private String AdministratorName;//管理员姓名
		private String AdministratorPassword;//管理员密码
		public int getAdministratorID() {
			return AdministratorID;
		}
		public void setAdministratorID(int administratorID) {
			AdministratorID = administratorID;
		}
		public String getAdministratorName() {
			return AdministratorName;
		}
		public void setAdministratorName(String administratorName) {
			AdministratorName = administratorName;
		}
		public String getAdministratorPassword() {
			return AdministratorPassword;
		}
		public void setAdministratorPassword(String administratorPassword) {
			AdministratorPassword = administratorPassword;
		}
		
}
