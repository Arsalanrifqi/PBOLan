package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.mysql.jdbc.*;

public class DBBiodata {
	Connection con;
	Statement st;
	ResultSet rs;
	public DBBiodata()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con	= (Connection) 
					DriverManager.getConnection("jdbc:mysql://127.0.0.1/biodata?user=root&password=");
	} catch	(SQLException e) {
		// TODO	Auto - generated catch block
		e.printStackTrace();
	}catch(ClassNotFoundException e) {
		// TODO Auto - generated catch block
		e.printStackTrace();
		}
	}
	
	public Vector data(){
		try	{
			st =(Statement) con.createStatement();
			rs =(ResultSet)	st.executeQuery("SELECT * FROM mahasiswa");
		} catch	(SQLException e) {
			// TODO	Auto - generated catch block
			e.printStackTrace();
		}
		Vector dBdata = new	Vector(1);
		try	{
			while(rs.next()){
				Vector rows	= new Vector();
				rows.add(rs.getString(1));
				rows.add(rs.getString(2));
				rows.add(rs.getString(3));
				rows.add(rs.getString(4));
				rows.add(rs.getString(5));
				rows.add(rs.getString(6));
				dBdata.addElement(rows);
			}
		} catch	(SQLException e) {
			//TODO Auto	- generated catch block
			e.printStackTrace();
		} 
		return dBdata;
	}
		
}