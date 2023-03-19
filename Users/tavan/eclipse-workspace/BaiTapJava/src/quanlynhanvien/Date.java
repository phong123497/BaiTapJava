package quanlynhanvien;

public class Date {
	int ngay , thang , nam;

	public int getNgay() {
		return ngay;
	}

	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public Date(int ngay, int thang, int nam) {
		
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public Date(int nam) {
		
		this.nam = nam;
	}
	
}
