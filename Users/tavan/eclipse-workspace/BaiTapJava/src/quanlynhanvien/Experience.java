package quanlynhanvien;

import java.util.ArrayList;

public class Experience extends Employee {
	
	private int expInYear;
	private String proSkill;
	
	
	public Experience(String iD, String fullName, String birthDay, String email, String phone, int employeeType,
			ArrayList<Certificated> certificated) {
		super(iD, fullName, birthDay, email, phone, employeeType, certificated);
		
	}

	public Experience(String iD, String fullName, String birthDay, String email, String phone, int employeeType,
			ArrayList<Certificated> certificated, int expInYear, String proSkill) {
		super(iD, fullName, birthDay, email, phone, employeeType, certificated);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
		employeeCount++;
	}


	public int getExpInYear() {
		return expInYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println( "id " +getID());
		System.out.println( "Ten la:" +getFullName());
		System.out.println( "Ngay sinh:"+getBirthDay());
		System.out.println( "Email: "+getEmail());
		System.out.println( "So Dien Thoai :"+getPhone());
		System.out.println( "thu tu nhan vien:"+getEmployeeCount());
		System.out.println( "loai nhan vien:"+getEmployeeType());
		ArrayList<Certificated> certificates = super.getCertificated();
		for (Certificated certificate : super.getCertificated()) {
	        System.out.println("chung chi ID: " + certificate.getCertificatedID());
	        System.out.println("ten chung chi: " + certificate.getCertificatedName());
	        System.out.println("Cap do : " + certificate.getCertificatedRank());
	        System.out.println("Thoi han : " + certificate.getCertificatedDate());
	    }
		
		System.out.println("so nam kinh nghiem : " + expInYear);
		System.out.println("ki nang : " + proSkill);
		
	}
}
