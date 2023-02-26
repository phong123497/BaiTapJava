package baitapjava;

import java.util.Scanner;

/**
	 * Viết chương trình cho phép nhập vào 3 số thực
		Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
	 */
public class Bai3Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap do dai canh 1 ");
		double c1 = sc.nextDouble();
		System.out.println("nhap do dai canh 2 ");
		double c2 = sc.nextDouble();
		System.out.println("nhap do dai canh 3 ");
		double c3 = sc.nextDouble();
		checkTamGiac(c1, c2, c3);
		
	}
	public static  void checkTamGiac(double a, double b,double c) {
		if (a +b <c || a+c <b || b +c < a ) {
			System.out.println("day khong phai la 1 hinh tam giac");
			
		}else {
			System.out.println(" thoa man yeu cau ,day la 1 hinh tam giac");
		}
		double a1,b1,c1;
		a1 = a*a;
		b1= b*b;
		c1= c*c;
		if(a1+b1 ==c1|| a1+c1== b1|| b1+c1==a1 ) {
			System.out.println(" 3 so thoa man ,day la tam giac vuong");
		}
		if (a ==b || b==c || a== c ) {
			System.out.println("day la tam giac can ");
			
		}
		if (a==b && b == c) {
			System.out.println("day la tam giac deu ");
		}
	}
}
