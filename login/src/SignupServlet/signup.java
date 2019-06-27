import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;

public class signup {

	public void InsertReg(String fname,String lname, String uname, String pass, String ssn, String email, String pnum, String gender) {
		Driver dbconn=new Driver();
		Connection con=dbconn.DBConnection();
		try {
		Statement st=con.createStatement();
        int result=st.executeUpdate("INSERT INTO `Jeremy_Mathew_Registration_Table`('First Name,'Last Name',`Username`, `Password`,'Social Security Number','E-Mail','Gender','Phone Number',)"
        		+ "VALUES ('fname','aads','dsda','eecs','xyz','vwx','azby','jklo')");
        System.out.println("Connection is successful::"+result);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

} 