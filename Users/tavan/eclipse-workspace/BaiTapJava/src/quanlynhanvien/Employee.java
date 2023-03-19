package quanlynhanvien;

import java.util.ArrayList;

/*
   *  Tất cả các Employee đều có các thuộc tính là: ID, FullName, BirthDay,Phone, Email, Employee type,Employee count 
   *  và phương thức là ShowInfo để hiển thị thông tin của nhân viên đó
   *  (hiển thị thông tin nhân viên ra màn hình console).    
   */
  	public abstract class Employee {
	private  String ID;
	private String fullName;
	private  String birthDay;
	private  String email;
	private String phone;
	private   int employeeType;
	public static int employeeCount = 0;
	private ArrayList<Certificated>  certificated ;;
	
	public abstract void showInfo();
	
	public String getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", fullName=" + fullName + ", BirthDay=" + birthDay + ", email=" + email
				+ ", phone=" + phone + ", employeeType=" + employeeType + ", certificated=" + certificated + "]";
	}
	
	
	public Employee(String iD, String fullName, String birthDay, String email, String phone, int employeeType,
			ArrayList<Certificated> certificated) {
		
		ID = iD;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.email = email;
		this.phone = phone;
		this.employeeType = employeeType;
//		this.certificated = new ArrayList<Certificated>(); ///để khi tạo mỗi đối tượng mơi và dùng add để tránh việc nullException
		this.certificated= certificated;
		
	}
	 public void addCertificate(Certificated certificate) {
	        certificated.add(certificate);
	    }
	public String outFile () {
		ArrayList<Certificated> certificateds=  getCertificated();
		String cerID = null, cerName = null, cerRank = null, cerDate = null;
		for (Certificated certificated : certificateds) {
			cerID = certificated.getCertificatedID();
			cerName = certificated.getCertificatedName();
			cerRank = certificated.getCertificatedRank();
			cerDate = certificated.getCertificatedDate();
		}
		return "id:"+ID+"\nfullName:"+fullName+"\nbirthDay:"+ birthDay +"\nemail:"+email+"\nphone:"+phone+"\nemployeeType:"+
		employeeType+"\nemployeeCount:"+employeeCount+ "\ncerID:"+cerID +"\ncerName:"+cerName+ "\ncerRank:"+ cerRank+"\ncerDate:"+ cerDate; 
	}
	
	
	public ArrayList<Certificated> getCertificated() {
		return certificated;
	}

	public void setCertificated(ArrayList<Certificated> certificated) {
		this.certificated = certificated;
	}

	public String getFullName() {
		return fullName;
	}

	public String  getBirthDay() {
		return birthDay;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	

	public int getEmployeeCount() {
		return employeeCount;
	}

	
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}

	public  int getEmployeeType() {
		return employeeType;
	}
	public void setID(String iD) {
		ID = iD;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmployeeCount(int employeeCount) {
		employeeCount = employeeCount;
	}

	public void parse() {
		// TODO Auto-generated method stub
		
	}
	
}
