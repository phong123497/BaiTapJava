package hocSinh;

import java.util.Scanner;

public class HocSinh {
	private int id;
	private String name;
	private int age;
	private String address;
	private double gpa;
	private String universityName = "Rmit";
	
	
	
	
	public HocSinh(int id, String name, int age, String address, double gpa ) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;

	}
	public HocSinh() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "HocSinh [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gpa=" + gpa
				+ ", universityName=" + universityName + "]";
	}
	public void input () {
		Scanner sc = new  Scanner(System.in);
		System.out.println("nhap id");
		id= Integer.parseInt(sc.nextLine());
		System.out.println("nhap ten");
		name = sc.nextLine();
		System.out.println("nhap tuoi");
		age= Integer.parseInt(sc.nextLine());
		System.out.println("nhap dia chi");
		address = sc.nextLine();
		System.out.println("nhap diem gpa");
		gpa = Double.parseDouble(sc.nextLine());
		
	}
	public String getFile() {
		
		return  id +","+ name+","+ age +","+ address +","+ gpa +"\n";
		
	}
	
	public void parse (String line) {
		try {
			String []paras = line.split(",");
			id = Integer.parseInt(paras[0]);
			name = paras[1];
			age = Integer.parseInt(paras[2]);
			address = paras[3];
			gpa = Double.parseDouble(paras[4]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public double getGpa() {
		return gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
