package baitapjava;
	/*
	 * Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
		In ra tất cả số nguyên tố trong khoảng từ 0 - n.
	 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai8 {
	// 
	  public static boolean kiemtrasonguyento(int n) {
	        if (n < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		try {
			do {
				System.out.println("nhap so  nguyen ban dau < 1000");
				input = Integer.parseInt(sc.nextLine());
				for (int i=0 ; i<=input; i++) {
					if (i < 2 ) {
//						System.out.println(i+"k phai so nguyen to");
					}else if (i ==2 ) {
						System.out.println(i +"la so nguyen to");
					}else if (i %i ==0&& i %2 ==1) {
						System.out.println(i +"la so nguyen to");
					}
				}
				
			} while (input>=1000);
		} catch (NumberFormatException e) {
			System.out.println("gia tri nhap k phai so");
		}
	}
	
	
}

