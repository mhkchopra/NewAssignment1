import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class EMPDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:M2172458","system","omomnamo");
		Statement st=con.createStatement();
		String sql1="select * from EMP_DETAILS";
		ResultSet rs1=st.executeQuery(sql1);
		while(rs1.next())
			System.out.println("Employee ID: "+rs1.getString("EMPLOYEE_ID")+"\nFirst Name: "+rs1.getString("EMPLOYEE_FNAME")+"\nLast Name: "+ rs1.getString("EMPLOYEE_LNAME")+"\nEmail ID: "+ rs1.getString("EMAIL_ID")+"\nAddress: "+ rs1.getString("ADDRESS")+"\nDesignation: "+ rs1.getString("DESIGNATION")+"\nDepartment: "+ rs1.getString("DEPARTMENT"));
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub
 }

}

