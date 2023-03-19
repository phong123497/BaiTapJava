package quanlynhanvien;

public class Certificated {
	private String certificatedID;
	private String certificatedName;
	private String certificatedRank;
	private String certificatedDate;
	
	
	public String getCertificatedID() {
		return certificatedID;
	}
	public Certificated(String certificatedName) {
	
		this.certificatedName = certificatedName;
	}
	public Certificated(String certificatedID, String certificatedName, String certificatedRank,
			String certificatedDate) {
		
		this.certificatedID = certificatedID;
		this.certificatedName = certificatedName;
		this.certificatedRank = certificatedRank;
		this.certificatedDate = certificatedDate;
	}
	public String getCertificatedName() {
		return certificatedName;
	}
	public String getCertificatedRank() {
		return certificatedRank;
	}
	public String getCertificatedDate() {
		return certificatedDate;
	}
	public void setCertificatedID(String certificatedID) {
		this.certificatedID = certificatedID;
	}
	public void setCertificatedName(String certificatedName) {
		this.certificatedName = certificatedName;
	}
	public void setCertificatedRank(String certificatedRank) {
		this.certificatedRank = certificatedRank;
	}
	public void setCertificatedDate(String certificatedDate) {
		this.certificatedDate = certificatedDate;
	}
}
