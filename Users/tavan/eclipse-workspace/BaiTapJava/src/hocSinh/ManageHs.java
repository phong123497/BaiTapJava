package hocSinh;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ManageHs {
     static ArrayList<HocSinh> listsHocSinh = new ArrayList<>();
     Scanner sc = new Scanner(System.in);

     public   void  addHs() { 
    	HocSinh hs= new HocSinh();// khi đặt ở ngoài block có kết quả khác
    	
    	hs.input();
    	listsHocSinh.add(hs);
    	System.out.println("them sinh vien thanh cong");
     }

	public  void editStudentById() {
//		HocSinh hs= new HocSinh();
		System.out.println("nhap id sinh vien can sua");
		int id = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < listsHocSinh.size(); i++) {
			if (listsHocSinh.get(i).getId()== id) {
				
				System.out.println("nhap Id");
				int id1 =Integer.parseInt(sc.nextLine());
				
				System.out.println("nhap ten");
				String name =sc.nextLine();
				
				System.out.println("nhap tuoi");
				int age =Integer.parseInt(sc.nextLine());
				
				System.out.println("nhap dia chi");
				String Address=sc.nextLine();
				
				System.out.println("nhap diem");
				double diem = Double.parseDouble(sc.nextLine());
//				HocSinh hs= new HocSinh(id , name, age, Address, diem);
				
//				hs.setId(id1);
				listsHocSinh.get(i).setId(id1);
				listsHocSinh.get(i).setName(name);
				listsHocSinh.get(i).setAge(age);
				listsHocSinh.get(i).setAddress(Address);
				listsHocSinh.get(i).setGpa(diem);
				System.out.println("sua hoc sinh thanh cong");
				
				
			}else {
				System.out.println("khong tim thay hoc sinh co id  nhu tren");
			}
		}
	}

	public void deleteStudentById() {
		System.out.println("nhap id sinh vien can xoa");
		int id = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < listsHocSinh.size(); i++) {
			if (listsHocSinh.get(i).getId()== id) {
				listsHocSinh.remove(i);
				break;
				
			}else {
				System.out.println("khong tim thay hoc sinh co id  nhu tren");
			}
		}
	}
	

	public void sortStudentByGpa() {
		Collections.sort(listsHocSinh,  new Comparator<HocSinh>() {

			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				if (o1.getGpa()> o2.getGpa()) {
					return-1;
				}
				return 1;
			}
		});
		System.out.println("sortStudentByGpa");
		
		for (HocSinh hs : listsHocSinh) {
			System.out.println(hs);
		}
	}
	public void sortStudentByName() {
		Collections.sort(listsHocSinh, new Comparator<HocSinh>() {

			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				
				return  - o1.getName().compareTo(o2.getName());
				
			}
		});
		System.out.println("sortStudentByName:");
		for (int i = 0 ; i <listsHocSinh.size(); i++) {
			System.out.println(listsHocSinh.get(i));
		}
		
	}

	public   void showStudent() {
		for (HocSinh sv :listsHocSinh) {
			System.out.println(sv);
		}
		
	}

	public void xuatFile() {
		FileOutputStream  fos = null;
		try {
			fos= new FileOutputStream("hocsinh.txt",true);
			for (HocSinh hs :listsHocSinh) {
				String line = hs.getFile();
				byte [] byteArr = line.getBytes("utf8");
				fos.write(byteArr);
				fos.flush();
			}
			System.out.println("xuat file thanh cong");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public void docFile() {
		FileInputStream fis = null;
		InputStreamReader input = null;
		BufferedReader bis = null;
		
		try {
			fis= new FileInputStream("hocsinh.txt");
			input = new InputStreamReader(fis,StandardCharsets.UTF_8 );  // đọc file kiểu utf 8
			bis = new BufferedReader(input);
			String line  = null;
			
			while ((line = bis.readLine())!= null) {
				if (line.isBlank()) {  // nếu dòng rỗng bỏ qua không đọc
					continue;
				}
				HocSinh hs = new HocSinh();
				hs.parse(line);
				listsHocSinh.add(hs);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fis!= null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (bis!= null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
