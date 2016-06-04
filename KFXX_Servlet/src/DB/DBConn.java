package DB;
/**
 * 数据库连接与关闭
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	private static Connection conn;
	public static Connection getConn(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KFXX","sa","z361224g");
			System.out.println("数据库连接0");
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
