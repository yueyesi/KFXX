package DB;
/**
 * ���ݿ�������ر�
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	private static Connection conn;
	public static Connection getConn(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KFXX","sa","z361224g");
			System.out.println("���ݿ�����0");
			return conn;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public static void closeConn(){
		try{
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
