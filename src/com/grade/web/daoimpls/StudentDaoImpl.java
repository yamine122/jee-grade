package com.grade.web.daoimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.StudentDao;
import com.grade.web.domains.StudentBean;

public class StudentDaoImpl implements StudentDao{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt%s" , 
			 File.separator,
			 File.separator,
			 File.separator,
			 File.separator,
			 File.separator,
			 File.separator,
			 File.separator,
			 File.separator);
	@Override
	public void insertGrade(StudentBean param) {
		
		try {
			File file = new File(FILE_PATH + "student.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s  %s  %s  %s  %s  %s  %s  %s  %s", param.getName(),param.getSsn(),param.getHakbun(),param.getKor(),param.getEng()
							, param.getMath(), param.getSoc(),param.getSum(), param.getAvg()));
			writer.newLine();
			writer.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
