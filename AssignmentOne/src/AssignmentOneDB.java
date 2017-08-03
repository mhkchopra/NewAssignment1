import java.sql.*;
public class AssignmentOneDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:M2172548","system","omomnamo");
		Statement st=con.createStatement();
		String sql="select * from Salary_Slip";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
			System.out.println(rs.getInt(1)+"   "+rs.getString(2));
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub
 }

}
