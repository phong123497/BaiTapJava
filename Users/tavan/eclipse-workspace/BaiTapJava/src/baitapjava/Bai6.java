package baitapjava;

import java.util.Scanner;

	/**
	 * 
	 *Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
	 *
	 */
public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		do {
			System.out.println("nhap so ban dau");
			num =sc.nextInt();
			for (int i =0 ; i <= num; i++) {
				if (i %2 ==0 ) {
					sum +=i ;
				}
				
			}
			System.out.println("tong so chan la :" +sum);
		} while (num >=0);
	}
}
