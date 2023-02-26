package baitapjava;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean tieptuc = true;
		a:while (tieptuc) {
			int num = 0;
			  do {
				try {
					System.out.println("nhap so nguyen tu 1 -9");
					num =Integer.parseInt(sc.nextLine());
					
					switch (num) {
					case 1: {
						System.out.println("một");
						break;
					}
					case 2: {
						System.out.println("Hai");
						break;
					}
					case 3: {
						System.out.println("Ba");
						break;
					}
					case 4: {
						System.out.println("Bốn");
						break;
					}
					case 5: {
						System.out.println("Năm");
						break;
					}
					case 6: {
						System.out.println("sáu");
						break;
					}
					case 7: {
						System.out.println("Bảy");
						break;
					}
					case 8: {
						System.out.println("Tám");
						break;
					}
					case 9: {
						System.out.println("Chín");
						break;
					}
				}	
					if (num <1 || num >9) {
//						System.out.println("hay nhap lai dung gia tri tu 1- 9");
//						continue a;
					}
					
				} catch (Exception e) {
					while(true) {
						System.out.println("hay nhap so nguyen");
						try {
							num = Integer.parseInt(sc.nextLine());
							break;
						} catch (NumberFormatException e2) {
//							System.out.println("hay nhap so nguyen");
						}
					}
				}
			} while (num <1 || num >9);
			
			System.out.println("tiep tuc nhap nua khong? co/khong");
//			sc.nextLine();
			
			String input = sc.nextLine();
			if (!input.equalsIgnoreCase("co")){
				if (input.equalsIgnoreCase("khong")) {
					 tieptuc = false;
					 break;
				}
				b:while(true) {
					System.out.println("hay nhap lai khong hoac co ");
					input = sc.nextLine();
					if (input.equalsIgnoreCase("co")) {
						tieptuc = true;
						break;
					}else if (input.equalsIgnoreCase("khong ")) {
						 tieptuc = false;
						 break;
					}else if (!input.equalsIgnoreCase("khong")) {
						System.out.println("đệt bảo không và có thôi mà \nnhập laị đi!!");
						
						input = sc.nextLine();
						c:while(true) {
							if (input.equalsIgnoreCase("co")) {
								tieptuc = true;
								break b;
							}else if (input.equalsIgnoreCase("khong")) {
								 tieptuc = false;
								 break a;
							}else if (!input.equalsIgnoreCase("khong")) {
								System.out.println("bực vl ra ợ  @@ ^ ^ nhap  lai di ");
								input= sc.nextLine();
								continue c;
							}
						}
					}
				}
			}else if (input.equalsIgnoreCase("co")){
				 tieptuc = true;
			}
		}
		
	}
}
