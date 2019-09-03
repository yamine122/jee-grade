package com.grade.web.services;

import com.grade.web.domains.StudentBean;

public interface StudentService {
	public void createGrade(StudentBean param);
	public String createGradeNum(StudentBean param);
	public String createSum(StudentBean param);
	public String createAvg(StudentBean param);

}
