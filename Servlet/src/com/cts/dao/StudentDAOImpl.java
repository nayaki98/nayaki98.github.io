package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;






import com.cts.Bean.Student;
import com.cts.Utill.DBConstants;
import com.cts.Utill.DBUtil;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public boolean InsertData(Student student) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
				try  {
					con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);
					pst=con.prepareStatement("insert into stu(rno,name,dept,gender) values(?,?,?,?)");
					pst.setInt(1, student.getRno());
					pst.setString(2, student.getName());
					pst.setString(3, student.getDepartment());
					pst.setString(4, student.getGender());
					int rs=pst.executeUpdate();
					if(rs>0)
						b=true;
					else
						b=false;
					con.close();
				}
				catch (Exception e2) {
					e2.printStackTrace();
	
				}
		return b;
	}

	


}
