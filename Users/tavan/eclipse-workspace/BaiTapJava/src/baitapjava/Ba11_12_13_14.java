package baitapjava;

import java.util.InputMismatchException;
/**
 * bai11 
 * Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
	Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
	bai12
	Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
	Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
	bai 13
	Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
	Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.
	bai 14
	Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
	Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.


	
 */
import java.util.Scanner;

public class Ba11_12_13_14 {
	public static void main(String[] args) {
//		findMax();
		findMin();
	}
	public static void tinhTrungBinh() {
		Scanner sc = new Scanner(System.in);
		int num ;
		try {
			System.out.println("nhap so luong so ban dau");
			num = Integer.parseInt(sc.nextLine());
			double sum =0;
			int [] arr = new int[num];
			for (int i = 0 ; i <num; i++) {
				
				System.out.println(" nhap phan tu thu :" + (i+1)+ ":" );
				arr[i]= sc.nextInt();
				sum = arr[i]+sum;
			}
			
			System.out.println("gia tri trung binh la" + sum /num );
		} catch (NumberFormatException e) {
			System.out.println("nhap du lieu k phai so" +e );
		}
	}
	public static void findMax() {
		Scanner sc = new Scanner(System.in);
		int num ,max ;
		boolean nhap = true;
		do {
			try {
				do {
					System.out.println("nhap so luong so phan tu ban dau");
					num = Integer.parseInt(sc.nextLine());
					int [] arr = new int[num];
					max = arr[0];
					int index=-1 ;
					for(int i =0;i < num; i ++) {
						do {
							System.out.println("phan tu thu :"+ (i+1)+ "");
							
							arr[i]= sc.nextInt();
							if (arr[i]<0) {
								System.out.println("hay nhap so nguyen duong");
							}
							if (max<arr[i]) {
								max = arr[i];
								index= i;
								
							}
						} while (arr[i] <0 );
						
					}
					System.out.println("max la phan tu thu "+ (index+1)+" gia tri :" +max);
					
				} while (num <0);
				
			} catch (NumberFormatException e) {
				System.out.println("nhap du lieu k phai so" +e );
			}catch (NegativeArraySizeException e) {
				System.out.println("da nhap so am");
			}
			nhap= false;
			
		} while (nhap);
	}
	public static void findMin() {
		Scanner sc = new Scanner(System.in);
		boolean tiepTuc= true;
		while (tiepTuc) {
			int num ,min = Integer.MAX_VALUE;
			do {
				try {
					System.out.println("nhap so phan tu ban dau");
					num = sc.nextInt();
					if (num <0) {
						System.out.println("hay nhap so lon hon 0");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("nhap 1 so nguyen hay nhap lai");
					sc.nextLine();
				}
			} while (true);
			int [] arr = new int[num];
			int index=-1;
			for(int i =0; i <num; i ++) {
				do {
					try {
						System.out.println("phan tu thu "+ (i+1) );
						arr[i]= sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("nhap 1 so nguyen, hay nhap lai");
						sc.nextLine();
					}
				} while (true);
				if (arr[i]< min) {
					min = arr[i];
					index =i;
				}
			}
			
			System.out.println("phan tu be nhat la phan tu thu "+ (index +1) +" gia tri " + min);
			//bai 14 sap xep nguoc phan tu lai
			System.out.println("mang nguoc chieu la");
			for (int i=0 ; i<=num/2; i++) {
				int temp = arr[i];
				arr[i]= arr[num-i-1];
				arr[num-i-1]= temp;
			}
			for (int i=0 ; i< num; i++) {
				System.out.println(arr[i]);
			}
			
			System.out.println("co tiep tuc chuong trinh khong ? yes/ no");
			
			sc.nextLine();
			String input = sc.nextLine();
			if (!input.equalsIgnoreCase("yes")) {
				tiepTuc = false;
			}
		}
	}
	
	
}
















	












