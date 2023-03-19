package quanlynhanvien;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeManagement {

	private ArrayList<Employee> employeeList = new ArrayList<>();;
	static Scanner sc = new Scanner(System.in);
//    private  ArrayList<Certificated> certificated= new ArrayList<>();

	public void addEmployee() {
		int employeeType;
		String fullName;
		String birtday;
		String emaail;
		String phone;

		do {

			System.out.println("0: Experience");
			System.out.println("1: Fresher ");
			System.out.println("2:Intern");
			System.out.println("chon  nhan vien ");
			employeeType = Integer.parseInt(sc.nextLine());

		} while (employeeType < 0 || employeeType > 2);
		System.out.println("nhap id nhan vien");
		String id = sc.nextLine();
		while (true) {
			System.out.println("nhap ten nhan vien");
			fullName = sc.nextLine();
			try {
				checkfullName(fullName);
				break;
			} catch (FullNameException e) {

				System.out.println(e);
			}
		}
		while (true) {
			System.out.println("nhap nam sinh ");
			birtday = sc.nextLine();
			try {
				checkDate(birtday);
				break;
			} catch (BirthDayException e) {
				System.out.println(e);
			}
		}

		while (true) {
			System.out.println("nhap email nhan vien");
			emaail = sc.nextLine();
			try {
				checkEmail(emaail);
				break;
			} catch (EmailException e) {
				System.out.println(e);
			}
		}

		while (true) {
			System.out.println("nhap so dien thoai lien he ");
			phone = sc.nextLine();
			try {
				checkPhone(phone);
				break;
			} catch (PhoneException e) {
				System.out.println(e);
			}

		}

		System.out.println("nhap so chung chi ");
		int soLuong = Integer.parseInt(sc.nextLine());

		switch (employeeType) {
		case 0: {
			ArrayList<Certificated> certi = new ArrayList<>();
			for (int i = 0; i < soLuong; i++) {
				System.out.println("nhap certificatedID ");
				String certificatedID = sc.nextLine();
				System.out.println("nhap certificatedName ");
				String cerName = sc.nextLine();
				System.out.println("nhap certificatedRank ");
				String cerRank = sc.nextLine();
				System.out.println("nhap certificatedDate ");
				String cerDate = sc.nextLine();

				Certificated cer = new Certificated(certificatedID, cerName, cerRank, cerDate);
				certi.add(cer);
			}

			System.out.println("nhap thanh cong");
			System.out.println("nhap so nam kinh nghiem");
			int expInYear = Integer.parseInt(sc.nextLine());
			System.out.println("nhap ki nang ");
			String proSkill = sc.nextLine();
			Employee emp = new Experience(id, fullName, birtday, emaail, phone, employeeType, certi, expInYear,
					proSkill);
			employeeList.add(emp);
			System.out.println("nhap thanh cong");
			break;
		}
		case 1: {
			ArrayList<Certificated> certi = new ArrayList<>();
			for (int i = 0; i < soLuong; i++) {
				System.out.println("nhap certificatedID ");
				String certificatedID = sc.nextLine();
				System.out.println("nhap certificatedName ");
				String cerName = sc.nextLine();
				System.out.println("nhap certificatedRank ");
				String cerRank = sc.nextLine();
				System.out.println("nhap certificatedDate ");
				String cerDate = sc.nextLine();

				Certificated cer = new Certificated(certificatedID, cerName, cerRank, cerDate);
				certi.add(cer);
			}
			System.out.println("nhap nam tot nghiep");

			String graduationDate = sc.nextLine();
			System.out.println("nhap graduationRank ");
			String graduationRank = sc.nextLine();

			System.out.println("nhap education ");
			String education = sc.nextLine();

			employeeList.add(new Fresher(id, fullName, birtday, emaail, phone, employeeType, certi, graduationDate,
					graduationRank, education));
			System.out.println("nhap thanh cong");
			break;
		}
		case 2: {
			ArrayList<Certificated> certi = new ArrayList<>();
			for (int i = 0; i < soLuong; i++) {
				System.out.println("nhap certificatedID ");
				String certificatedID = sc.nextLine();
				System.out.println("nhap certificatedName ");
				String cerName = sc.nextLine();
				System.out.println("nhap certificatedRank ");
				String cerRank = sc.nextLine();
				System.out.println("nhap certificatedDate ");
				String cerDate = sc.nextLine();

				Certificated cer = new Certificated(certificatedID, cerName, cerRank, cerDate);
				certi.add(cer);
			}
			System.out.println("nhap  majors");
			String majors = sc.nextLine();
			System.out.println("nhap hoc ki  ");
			String semester = sc.nextLine();

			System.out.println("nhap truong dai hoc ");
			String universityName = sc.nextLine();

			employeeList.add(new Intern(id, fullName, birtday, emaail, phone, employeeType, certi, majors, semester,
					universityName));
			System.out.println("nhap thanh cong");
			break;
		}
		default:
			throw new IllegalArgumentException("nhap khong dung kieu nhan vien: " + employeeType);
		}

	}

	public void deleteEmploy() {

		System.out.println("nhap id nhan vien muon sua ");
		String id = sc.nextLine();
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getID().equals(id)) {
				if (employeeList.get(i) instanceof Experience) {
					System.out.println("id cua nhan vien  co kinh nghiem ");
					employeeList.remove(i);
					System.out.println(" xoa nhan vien thanh cong ");
				}
				if (employeeList.get(i) instanceof Fresher) {
					System.out.println("id cua nhan vien  cua nhan vien moi  ");
					employeeList.remove(i);
					System.out.println(" xoa nhan vien thanh cong ");
				}
				if (employeeList.get(i) instanceof Intern) {
					System.out.println("id cua nhan vien  cua nhan vien thu viec   ");
					employeeList.remove(i);
					System.out.println(" xoa nhan vien thanh cong ");
				}
			} else {
				System.out.println("ID khong co trong danh sach ");
			}
		}
	}

	public void showInfoAllEmploy() {
		for (Employee employee : employeeList) {
			if (employee instanceof Experience) {
				System.out.println("Day la nhan vien co kinh nghiem ");
				employee.showInfo();
			}
			if (employee instanceof Fresher) {
				System.out.println("Day la nhan vien chua co kinh nghiem  ");
				employee.showInfo();
			}
			if (employee instanceof Intern) {
				System.out.println("Day la nhan vien thuc tap ");
				employee.showInfo();
			}
		}

	}

	public void sortEmployeByName() {
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return -o1.getFullName().compareTo(o2.getFullName());
			}
		});

		System.out.println("sap xep nhan vien theo ten");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}

	// find all intern employees

	public ArrayList<Intern> findAllInterns() {
		ArrayList<Intern> internList = new ArrayList<>();
		for (Employee employee : employeeList) {
			if (employee instanceof Intern) {
				internList.add((Intern) employee);

			}
		}
		for (Intern inter : internList) {
			inter.showInfo();
		}

		return internList;
	}

	public void showAllCertificates() {
		for (Employee employee : employeeList) {
//            if (employee instanceof Experience) {
			ArrayList<Certificated> certificates = employee.getCertificated();
			System.out.println(employee.getFullName() + " has the following certificates:");
			for (Certificated cert : certificates) {
				System.out.println("CertificatedID: " + cert.getCertificatedID());
				System.out.println("Certificate Name: " + cert.getCertificatedName());
				System.out.println("Certificate Rank: " + cert.getCertificatedRank());
				System.out.println("Certificated Date: " + cert.getCertificatedDate());
			}
		}
//        }
	}

	public void findEmployeNameByCertificateName() {
		System.out.println("nhap ten chung chi");
		String certificate = sc.nextLine();
		for (Employee employee : employeeList) {
			ArrayList<Certificated> certificates = employee.getCertificated();
			for (Certificated cert : certificates) {

				if (cert.getCertificatedName().equals(certificate)) {
					System.out.println(employee.getFullName() + " co chung chi nhu sau:");
					System.out.println("CertificatedID: " + cert.getCertificatedID());
					System.out.println("Certificate Name: " + cert.getCertificatedName());
					System.out.println("Certificate Rank: " + cert.getCertificatedRank());
					System.out.println("Certificated Date: " + cert.getCertificatedDate());
				}
			}
		}
	}

	public void exctracToFile() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("nhanvien.txt");
			for (Employee employee : employeeList) {
				if (employee instanceof Fresher) {
					String line = ((Fresher) employee).toFile();
					try {
						byte[] byteArr = line.getBytes("utf8");
						fos.write(byteArr);
						fos.flush();
						System.out.println("xuat file thanh cong");
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void readfile() {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("nhanvien.txt"))) {
		    String line;
		    Employee employee = null;
//		    Certificated certificate = null;

		    while ((line = bufferedReader.readLine()) != null) {
		        String[] parts = line.split(":");
		        String fieldName = parts[0];
		        String fieldValue = parts[1];
		        String cerid = null, cerName = null, cerRank= null,cerDate= null;
		        switch (fieldName) {
		            case "id":
		                String id = fieldValue;
		                // Tạo một đối tượng Employee mới với id tương ứng
		                employee = new Fresher(id, id, id, id, line, 0, null, fieldName, fieldValue, id) ;
		                break;
		            case "fullName":
		                employee.setFullName(fieldValue);
		                break;
		            case "birthDay":
		                employee.setBirthDay(fieldValue);
		                break;
		            case "email":
		                employee.setEmail(fieldValue);
		                break;
		            case "phone":
		                employee.setPhone(fieldValue);
		                break;
		            case "employeeType":
		                employee.setEmployeeType(Integer.parseInt(fieldValue));
		                break;
		            case "employeeCount":
		            	int employeeCount = Integer.parseInt(fieldValue);
		            	break;
		            case "cerID":
		            	  cerid = fieldValue;
		                break;
		            case "cerName":
		            	 cerName= fieldValue;
		            	break;
		            case "cerRank":
		            	 cerRank = fieldValue;
		            	break;
		            case "cerDate":
		            	 cerDate = fieldValue;
		            	break;
		            case "graduationDate":
		                ((Fresher) employeeList.get(employeeList.size() - 1)).setGraduationDate(fieldValue);
		                break;
		            case "graduationRank":
		                ((Fresher) employeeList.get(employeeList.size() - 1)).setGraduationRank(fieldValue);
		                break;
		            case "education":
		                ((Fresher) employeeList.get(employeeList.size() - 1)).setEducation(fieldValue);
		                break;
		            default:
		                throw new IllegalStateException("Unexpected value: " + fieldName);
		               
		               
		        }

		        Certificated certificate = new Certificated(cerid, cerName, cerRank, cerDate);
		        ArrayList<Certificated> certificateds = new  ArrayList<Certificated>();
		        certificateds.add(certificate);
		        employee.addCertificate(certificate);
                employeeList.get(employeeList.size() - 1).getCertificated().add(certificate);
		        employeeList.add(employee);
		    }
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	// find all experience employees
	public ArrayList<Experience> findAllExperiences() {
		ArrayList<Experience> experienceList = new ArrayList<>();
		for (Employee employee : employeeList) {
			if (employee instanceof Experience) {
				experienceList.add((Experience) employee);
			}
		}
		for (Experience experience : experienceList) {
			experience.showInfo();
			;
		}
		return experienceList;
	}

	// find all fresher employees
	public ArrayList<Fresher> findAllFreshers() {
		ArrayList<Fresher> fresherList = new ArrayList<>();
		for (Employee employee : employeeList) {
			if (employee instanceof Fresher) {
				fresherList.add((Fresher) employee);
			}
		}
		for (Fresher fresher : fresherList) {
			fresher.showInfo();
		}
		return fresherList;
	}

	public void checkEmail(String email) throws EmailException {

		Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+\\.com\\b");
		if (p.matcher(email).find()) {
			System.out.println("email hop le");
		} else {
			throw new EmailException("nhap email chua hop le:" + email);
		}
	}

	public void checkDate(String date) throws BirthDayException {

		Pattern p = Pattern.compile("\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{4})\\b");
		if (p.matcher(date).find()) {
			System.out.println("ngay thang hop le");

		} else {
			throw new BirthDayException("ngay sinh khong hop le " + date);

		}

	}

	public void checkPhone(String phoneNumber) throws PhoneException {

		Pattern p = Pattern.compile("^(090|080)(\\d{6})\\b");
		if (p.matcher(phoneNumber).find()) {
			System.out.println("nhap thanh cong so dien thoai");
		} else {
			throw new PhoneException("so dien thoai nhap sai kieu phai la dau 090/ 080 " + phoneNumber);
		}
	}

	public void checkfullName(String name) throws FullNameException {
		Pattern p = Pattern.compile("^[A-Z][a-z]+\\s[A-Z][a-z]+$");
		if (p.matcher(name).find()) {
			System.out.println("nhap ten dung");
		} else {
			throw new FullNameException("nhap ten chua dung bat dau bang viet hoa co 2 chu cai " + name);
		}
	}

}
