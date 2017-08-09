import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ViewSalaryDB {

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
		String sql1="select * from SALARY_SLIP";
		ResultSet rs1=st.executeQuery(sql1);
		while(rs1.next())
			System.out.println("Employee ID: "+rs1.getString("EMP_ID")+"\nName: "+rs1.getString("EMPLOYEE_NAME")+"\nDesignation: "+ rs1.getString("DESIGNATION")+"\nDepartment: "+ rs1.getString("DEPARTMENT")+"\nConveynance Allowance: "+ rs1.getString("CONVEYNANCE_ALLOWANCE")+"\nBasic Pay: "+ rs1.getString("BASIC_PAY")+"\nINSURANCE: "+ rs1.getString("INSURANCE")+"\nNet Salary: "+ rs1.getString("NET_SALARY")+"\nGross Salary: "+ rs1.getString("GROSS_SALARY")+"\nNo. of Working Days: "+ rs1.getString("WORKING_DAYS")+"\nLoss of Pay: "+ rs1.getString("lOSS_OF_PAY"));
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
