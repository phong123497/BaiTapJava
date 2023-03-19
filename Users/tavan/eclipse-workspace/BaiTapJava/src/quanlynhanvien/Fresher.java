package quanlynhanvien;

import java.util.ArrayList;

public class Fresher extends Employee {
	private String graduationDate;
	private String graduationRank;
	private String education;

	public Fresher(String iD, String fullName, String birthDay, String email, String phone, int employeeType,
			ArrayList<Certificated> certificated, String graduationDate, String graduationRank, String education) {
		super(iD, fullName, birthDay, email, phone, employeeType, certificated);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
		employeeCount++;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	public String toFile() {
		return super.outFile()+ "\ngraduationDate:"+graduationDate +"\ngraduationRank:"+ graduationRank+"\neducation:"+education;
		
	}
	
	@Override
	public void showInfo() {
		System.out.println("id " + getID());
		System.out.println("Ten la:" + getFullName());
		System.out.println("Ngay sinh:" + getBirthDay());
		System.out.println("Email: " + getEmail());
		System.out.println("So Dien Thoai :" + getPhone());
		System.out.println("thu tu nhan vien:" + getEmployeeCount());
		System.out.println("loai nhan vien:" + getEmployeeType());
		ArrayList<Certificated> certificates = super.getCertificated();
		for (Certificated certificate : super.getCertificated()) {
			System.out.println("chung chi ID: " + certificate.getCertificatedID());
			System.out.println("ten chung chi: " + certificate.getCertificatedName());
			System.out.println("Cap do : " + certificate.getCertificatedRank());
			System.out.println("Thoi han : " + certificate.getCertificatedDate());
		}

		System.out.println("graduationDate: " + graduationDate);
		System.out.println("graduationRank: " + graduationRank);
		System.out.println("education: " + education);

	}

}
