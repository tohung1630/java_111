package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QLSV {
	private ArrayList<SinhVien> dsSinhVien;

	public QLSV() {
		this.dsSinhVien = new ArrayList<SinhVien>();
		
	}

	public QLSV(ArrayList<SinhVien> dsSinhVien) {
		super();
		this.dsSinhVien = dsSinhVien;
	}

	public ArrayList<SinhVien> getDsSinhVien() {
		return dsSinhVien;
	}

	public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	
	public void them(SinhVien sinhVien) {
		this.dsSinhVien.add(sinhVien);
	}
	public void xoa(SinhVien sinhVien) {
		this.dsSinhVien.remove(sinhVien);
	}
	public void sua(SinhVien sinhVien) {
		this.dsSinhVien.remove(sinhVien);
		this.dsSinhVien.add(sinhVien);
	}

	public boolean kiemtra(SinhVien sv) {
		// TODO Auto-generated method stub
		for(SinhVien sinhvien: dsSinhVien)
		{
			if(sinhvien.getMaSinhVien() == sv.getMaSinhVien())
				return true;
		}
		return false;
	}
}
