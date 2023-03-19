package quanlynhanvien;

import java.util.Scanner;

public class EmployesMain {
	public static void main(String[] args) {
		EmployeeManagement emManagement = new EmployeeManagement();
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
			System.out.println("---------------------------------------------");
			System.out.println("1:them nhan vien");
			System.out.println("2:Hien Thi toan bo Nhan vien");
			System.out.println("3:Sap xep nhan vien theo ten");
			System.out.println("4:Tim  nhan vien theo ten chung  chi");
			System.out.println("5:Hien thinhan vien co kinh nghiem ");
			System.out.println("6:Hien thinhan vien chua co kinh nghiem");
			System.out.println("7:Hien thinhan vien thuc tap ");
			System.out.println("8: xoa nhan vien");
			System.out.println("9:Xuat file");
			System.out.println("10:doc file");
			System.out.println("chon chuc nang");
			chon= Integer.parseInt(sc.nextLine());
			
			
			switch (chon) {
			case 1: {
				emManagement.addEmployee();
				break;
			}
			case 2: {
				emManagement.showInfoAllEmploy();
				break;
			}
			case 3: {
				emManagement.sortEmployeByName();
				break;
			}
			case 4: {
				emManagement.findEmployeNameByCertificateName();
				break;
			}
			case 5: {
				emManagement.findAllExperiences();
				break;
			}
			case 6: {
				emManagement.findAllFreshers();
				break;
			}
			case 7: {
				emManagement.findAllInterns();
				break;
			}
			case 8: {
				emManagement.deleteEmploy();
				break;
			}
			case 9: {
				emManagement.exctracToFile();
				break;
			}
			case 10: {
				emManagement.readfile();
				break;
			}
			
			default:
				throw new IllegalArgumentException("gia chi chon khong dung: " + chon);
			}
			
		} while ( chon!=0 );
		
		
	}

	
}
