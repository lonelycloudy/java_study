//Java连接Mysql
import java.sql.*;
public class Jdbc{
	public static void main(String args[]){
		
		System.out.println("JDBC Test For Mysql");
		
		String dbDriver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/myjsp";
		String username = "boy";
		String password = "boy";

		Statement mStatement = null;
		ResultSet mResultSet = null;
		Connection mConnection = null;
		
		String sql = " select *  from test";
		try{
			Class.forName(dbDriver).newInstance();
			mConnection = DriverManager.getConnection(url, username, password);
			mStatement = mConnection.createStatement();
			mResultSet = mStatement.executeQuery(sql);
			
			try{
				while(mResultSet.next()){
					System.out.print(mResultSet.getInt(1) + "\t");
					System.out.print(mResultSet.getString(2) + "\t");
					System.out.print(mResultSet.getString(3) + "\t");
					//System.out.println(mResultSet.getString(4));
				}
			}catch (Exception e){
				//System.out.println("数据库读取错误！ \n" + e.getMessage());
				System.out.println(e.toString());//错误信息
			}
		}catch (SQLException e){
			//System.out.println("连接数据库错误: \n" + url + "\n" + e.getMessage());
			System.out.println("连接数据库错误: \n" + url + "\n");
		}catch (Exception e){
			System.out.println("程序异常: \n");
			//e.printStackTrace();
		}finally{
//			mStatement.close();
//				mConnection.close();
		}
	}
}
/**
F:\web_study\java_study>java Jdbc
JDBC Test For Mysql
1       title11 content1        java.sql.SQLException: Column Index out of range
, 4 > 3.
F:\web_study\java_study>javac Jdbc.java
F:\web_study\java_study>java Jdbc
JDBC Test For Mysql
1       title11 content1
*/\