package baitapjava;

import java.util.Scanner;

/*
	 * Viết chương trình để nhập nhập một số nguyên, tìm kết quả phép nhân 
	 * của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.
	 */
public class Bai7 {
	public static void main(String[] args) {
		// chỗ này e chưa hiểu đề bài lắm nên e làm thêm
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("nhap so nguyen");
			int num = Integer.parseInt(sc.nextLine());
			int soMuonNhan;
			do {
				System.out.println("so muon nhan voi so ban dau");
				soMuonNhan= Integer.parseInt(sc.nextLine());
				int ketqua = num * soMuonNhan;
				System.out.println("ket qua la" +ketqua);
			} while (soMuonNhan<1 && soMuonNhan>20);
			
		} catch (NumberFormatException e) {
			System.out.println("ban da nhap k phai kieu so");
		}
		ketQua();
	}
		
	public static void ketQua () {
		Scanner sc = new Scanner(System.in);
		int input, ketqua ;
		try {
			System.out.println("nhap so nguyen");
			input = Integer.parseInt(sc.nextLine());
			for (int i = 1 ; i <=20; i ++) {
				ketqua = i * input; 
				System.out.println("ket qua cua "+ i +" voi "+ input + "="+ ketqua);
			}
		} catch (NumberFormatException e) {
			System.out.println("ban da nhap k phai kieu so");
		}
		
	}
}
