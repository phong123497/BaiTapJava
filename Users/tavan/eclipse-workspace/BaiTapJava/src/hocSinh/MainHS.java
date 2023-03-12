package hocSinh;

import java.util.Scanner;

public class MainHS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HocSinh hs = new HocSinh();
		ManageHs manage = new ManageHs();
		int chon;
		do {
			System.out.println("/****************************************/");
			System.out.println("1. Add student");
			System.out.println("2. Edit student by id");		
			System.out.println("3. Delete student by id.");		
			System.out.println("4. Sort student by gpa.");		
			System.out.println("5. Sort student by name.");
			System.out.println("6. Show student.");
			System.out.println("7. xuat file");		
			System.out.println("8. doc file");		
			System.out.println("0. Exit.");		
			System.out.println("/****************************************/");		
			
			
			System.out.println("chon chuc nang");
			 chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				System.out.println("nhap so luong sinh vien can them");
				int n = Integer.parseInt(sc.nextLine());
				for (int i =0; i < n;i ++) {
					manage.addHs();
				}
				break;
			}
			case 2: {
				manage.editStudentById();
				break;
			}
			case 3: {
				manage.deleteStudentById();
				break;
			}
			case 4: {
				manage.sortStudentByGpa();
				break;
			}
			case 5: {
				manage.sortStudentByName();
				break;
			}
			case 6: {
				manage.showStudent();
				break;
			}
			case 7: {
				manage.xuatFile();
				break;
			}
			case 8: {
				manage.docFile();
				break;
			}
			case 0: {
				System.out.println("thoat khoi chuong trinh");
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + chon);
			}
		} while (chon !=0);
	}

	
}
