package Model;

import java.sql.Date;

public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private String ngaySinh;
	private String queQuan;
	private boolean gioiTinh;
	private float diemMon;
	
	public SinhVien() {
		
	}

	public SinhVien(int maSinhVien, String hoTen, String ngaySinh, String queQuan, boolean gioiTinh,
			float diemMon) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
		this.gioiTinh = gioiTinh;
		this.diemMon = diemMon;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}


	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public float getDiemMon() {
		return diemMon;
	}

	public void setDiemMon(float diemMon) {
		this.diemMon = diemMon;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", queQuan="
				+ queQuan + ", gioiTinh=" + gioiTinh + ", diemMon=" + diemMon + "]";
	}
	 
}
