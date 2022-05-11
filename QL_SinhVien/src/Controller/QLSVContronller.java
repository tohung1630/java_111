 package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.Action;
import javax.swing.JOptionPane;

import Model.SinhVien;
import View.QLSVView;

public class QLSVContronller implements Action{
	
	public QLSVView view;
	
	public QLSVContronller(QLSVView view) {

		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cm = e.getActionCommand();
		//
		//JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+cm);
		if(cm.equals("Hủy")) {
			this.view.Huy();
		}
		else if(cm.equals("Lưu")) {
				try {
					int maSinhVien = Integer.valueOf(this.view.textField_1.getText());
					String hoTen = this.view.textField_2.getText();
					String ngaySinh = this.view.textField_3.getText();
					String queQuan = this.view.textField_4.getText();
					boolean gioiTinh = true ;

					if(this.view.rdbtnNam.isSelected()) 
					{
						gioiTinh = true;
					}
					else {
						gioiTinh = false;
					}
					float diemMon = Float.valueOf(this.view.textField_5.getText());
					SinhVien SV =new SinhVien(maSinhVien,hoTen,ngaySinh,queQuan,gioiTinh,diemMon);
				
				
					this.view.them(SV);
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}}
				else if(cm.equals("Hiện Thị")) {
					this.view.hienthitongtin();
				}else if(cm.equals("Xóa")) {
					this.view.xoa();
				}

		}
			


	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}


}
