package quanlynhanvien;

import java.util.ArrayList;

public class Intern extends Employee {
	private String majors;
	private String semester;
	private String universityName;

	public Intern(String iD, String fullName, String birthDay, String email, String phone, int employeeType,
			ArrayList<Certificated> certificated, String majors, String semester, String universityName) {
		super(iD, fullName, birthDay, email, phone, employeeType, certificated);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
		employeeType++;
	}

	public String getMajors() {
		return majors;
	}

	public String getSemester() {
		return semester;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
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

		for (Certificated certificate : super.getCertificated()) {
			System.out.println("chung chi ID: " + certificate.getCertificatedID());
			System.out.println("ten chung chi: " + certificate.getCertificatedName());
			System.out.println("Cap do : " + certificate.getCertificatedRank());
			System.out.println("Thoi han : " + certificate.getCertificatedDate());
		}
		System.out.println("majors: " + majors);
		System.out.println("semester: " + semester);
		System.out.println("universityName: " + universityName);

	}

}
