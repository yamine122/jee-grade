package com.grade.web.serviceimpls;


import java.util.Random;

import com.grade.web.daoimpls.StudentDaoImpl;
import com.grade.web.daos.StudentDao;
import com.grade.web.domains.StudentBean;
import com.grade.web.services.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao dao;
	
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public void createGrade(StudentBean param) {
		param.setAvg(createAvg(param));
		param.setSum(createSum(param));
		param.setHakbun(createGradeNum(param));
		dao.insertGrade(param);
	}

	@Override
	public String createGradeNum(StudentBean param) {
		Random r = new Random();
		String num = String.format("2019-%s%03d",
				param.getSsn().substring(7,8),
				r.nextInt(999)+1);
		return num;
	}

	@Override
	public String createSum(StudentBean param) {
		String sum ="";
		
		
		sum = String.valueOf(Integer.parseInt(param.getKor()) 
				+ Integer.parseInt(param.getEng()) 
				+ Integer.parseInt(param.getMath()) 
				+ Integer.parseInt(param.getSoc()));
		return sum;
	}

	@Override
	public String createAvg(StudentBean param) {
		String avg = "";
		
		avg = String.valueOf((Integer.parseInt(param.getKor()) 
				+ Integer.parseInt(param.getEng()) 
				+ Integer.parseInt(param.getMath()) 
				+ Integer.parseInt(param.getSoc()))/4);
		
		return avg;
	}
	
}
