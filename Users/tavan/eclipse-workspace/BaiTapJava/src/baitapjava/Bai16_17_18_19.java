package baitapjava;

import java.util.Scanner;

/*
 *  bai 16
 *  Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
	Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.
	bai17
	Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
	Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi, nếu không thì in ra “Không tồn tại trong chuỗi”.
	bai 18
	Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này có xuất hiện số hay không.
	Nếu có tin ra “Có”, ngược lại, in ra “Không”.
	bai 19
	Viết chương trình cho phép nhập vào một chuỗi
	Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
	In ra số lần đó.
 */
public class Bai16_17_18_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chuoi ban dau");
		String str = sc.nextLine();
		try {
				System.out.println("nhap ki tu kiem tra");
				char c =sc.next().charAt(0);
				int count =0;
				for (int i= 0 ; i <str.length(); i++) {
					if (str.charAt(i)== c) {
							count++;
						System.out.println("ki tu "+ c+ " xuat hien tai vi tri " + (i+1));
						}
					// bai 18
					if (Character.isDigit(str.charAt(i))) {
						
						System.out.println("co xuat hien tai vi tri " + (i+1) + " la so "+ Character.getNumericValue(str.charAt(i)));
						
					}else  {
						System.out.println("chuoi "+ str+ " khong co xuat hien so ");
					}
				}
					if (count ==0 ) {
						System.out.println("Không tồn tại trong chuỗi");
					}else {
						System.out.println("xuat hien trong chuoi so lan la " + count);
					}
			
				
		}catch(Exception e){
			System.out.println("do dai cua chuoi khong co");
		}
	}
}
