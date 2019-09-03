package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String ssn , name ,kor , eng , math , soc ,avg ,sum , hakbun;
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getSoc() {
		return soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}
	public String getAvg() {
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "StudentBean [ssn=" + ssn + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", soc=" + soc + ", avg=" + avg + ", sum=" + sum + ", hakbun=" + hakbun + "]";
	}
	

	
	


}
