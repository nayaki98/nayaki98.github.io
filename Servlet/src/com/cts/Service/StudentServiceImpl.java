package com.cts.Service;

import com.cts.Bean.Student;
import com.cts.dao.StudentDAO;
import com.cts.dao.StudentDAOImpl;

public class StudentServiceImpl implements StudentService {

	StudentDAO s=new StudentDAOImpl();
	@Override
	public boolean insert(Student student) {
		boolean res=s.InsertData(student);
		return res;
	}

}
