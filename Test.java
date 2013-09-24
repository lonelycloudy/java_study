//Java����Mysql
import java.sql.*;
public class Test{
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
				//System.out.println("���ݿ��ȡ���� \n" + e.getMessage());
				System.out.println(e.toString());//������Ϣ
			}
		}catch (SQLException e){
			//System.out.println("�������ݿ����: \n" + url + "\n" + e.getMessage());
			System.out.println("�������ݿ����: \n" + url + "\n");
		}catch (Exception e){
			System.out.println("�����쳣: \n");
			//e.printStackTrace();
		}finally{
//			mStatement.close();
//				mConnection.close();
		}
	}
}
/**
F:\web_study\java_study>java Test
JDBC Test For Mysql
1       title11 content1        java.sql.SQLException: Column Index out of range
, 4 > 3.
F:\web_study\java_study>javac Test.java
F:\web_study\java_study>java Test
JDBC Test For Mysql
1       title11 content1
*/