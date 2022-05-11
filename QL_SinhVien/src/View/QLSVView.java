package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.QLSV;
import Model.SinhVien;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop.Action;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Controller.QLSVContronller;

import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	public QLSV model;
	public JTable table;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JRadioButton rdbtnNu;
	public ButtonGroup btn_gioitinh;
	public JRadioButton rdbtnNam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model= new QLSV();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 615);
		
		ActionListener action = new QLSVContronller(this);
		
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblDanhSchSinh = new JLabel("Danh S\u00E1ch Sinh Vi\u00EAn");
		lblDanhSchSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDanhSchSinh.setBounds(10, 27, 266, 46);
		contentPane.add(lblDanhSchSinh);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Họ Tên", "Ngày Sinh", "Quê Quán", "Giới Tính", "Điểm"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 84, 676, 194);
		contentPane.add(scrollPane);
		
		JLabel lblThngTinSinh = new JLabel("Thông Tin Sinh Viên");
		lblThngTinSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThngTinSinh.setBounds(10, 289, 266, 46);
		contentPane.add(lblThngTinSinh);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sinh Viên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 329, 96, 46);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 336, 187, 37);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên Sinh Viên");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(22, 386, 113, 46);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 384, 187, 37);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ngày Sinh");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(22, 433, 113, 46);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(155, 432, 187, 37);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quê Quán");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(375, 329, 96, 46);
		contentPane.add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(481, 329, 187, 37);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Giới Tính");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(375, 386, 96, 46);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Điểm");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_2.setBounds(375, 433, 96, 46);
		contentPane.add(lblNewLabel_1_2_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(481, 432, 187, 37);
		contentPane.add(textField_5);
		
	 rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNam.setBounds(481, 386, 81, 37);
		contentPane.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNu.setBounds(587, 386, 81, 37);
		contentPane.add(rdbtnNu);
		
		JButton btnThem =  new JButton("Lưu");
		btnThem.addActionListener(action);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnThem.setBounds(22, 515, 135, 39);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(action);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoa.setBounds(207, 515, 135, 39);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Hiện Thị");

		btnCapNhat.addActionListener(action);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCapNhat.setBounds(397, 515, 135, 39);
		contentPane.add(btnCapNhat);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.addActionListener(action);
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHuy.setBounds(561, 515, 135, 39);
		contentPane.add(btnHuy);
		
		btn_gioitinh = new ButtonGroup();
		btn_gioitinh.add(rdbtnNam);
		btn_gioitinh.add(rdbtnNu);
	}

	public void Huy() {
		// TODO Auto-generated method stub
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		btn_gioitinh.clearSelection();
	}

	public void them(SinhVien sV) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if(!this.model.kiemtra(sV)) {
			this.model.them(sV);
			model_table.addRow(new Object[] {
					sV.getMaSinhVien()+"",
					sV.getHoTen(),
					sV.getNgaySinh().toString(),
					sV.getQueQuan(),
					(sV.isGioiTinh()?"Nam":"Nữ"),
					sV.getDiemMon()+"",
					
			});
		}
		else {
			this.model.sua(sV);
			int sld = model_table.getRowCount();
			for(int i=0;i<sld;i++)
			{
				String id=model_table.getValueAt(i, 0)+"";
				if(id.equals(sV.getMaSinhVien()+"")) {
					model_table.setValueAt(sV.getMaSinhVien()+"", i, 0);
					model_table.setValueAt(sV.getHoTen()+"", i, 1);
					model_table.setValueAt(sV.getNgaySinh()+"", i, 2);
					model_table.setValueAt(sV.getQueQuan()+"", i, 3);
					model_table.setValueAt(sV.isGioiTinh()?"Nam":"Nữ", i, 4);
					model_table.setValueAt(sV.getDiemMon()+"", i, 5);
				}
			}
			
		}
		
	}

	public SinhVien getSinhVien(){
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		model_table.getValueAt(i_row,0);
		 
		int maSinhVien = Integer.valueOf(model_table.getValueAt(i_row,0)+"");
		String hoTen = model_table.getValueAt(i_row,1)+"";
		String ngaySinh = model_table.getValueAt(i_row,2)+"";
		String queQuan = model_table.getValueAt(i_row,3)+"";
		String txtgioitinh = model_table.getValueAt(i_row,4)+"";
		boolean gioiTinh = txtgioitinh.equals("Nam") ;
		float diemMon = Float.valueOf(model_table.getValueAt(i_row,5)+"" );
		
		SinhVien sv =new SinhVien(maSinhVien, hoTen, ngaySinh, queQuan, gioiTinh, diemMon);
		return sv;
		
	}
	public void hienthitongtin() {
		// TODO Auto-generated method stub
		SinhVien sv = getSinhVien();
		
		
		this.textField_1.setText(sv.getMaSinhVien()+"");
		this.textField_2.setText(sv.getHoTen()+"");
		this.textField_3.setText(sv.getNgaySinh()+"");
		this.textField_4.setText(sv.getQueQuan()+"");
		this.textField_5.setText(sv.getDiemMon()+"");
		if(sv.isGioiTinh()) {
			rdbtnNam.setSelected(true);
		}else {
			rdbtnNu.setSelected(true);
		}
	}

	public void xoa() {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int lc = JOptionPane.showConfirmDialog(this , "Bạn có muốn xóa không");
		if(lc==JOptionPane.YES_OPTION)
		{
			SinhVien sv = getSinhVien();
			this.model.xoa(sv);
			model_table.removeRow(i_row);
		}
	}





}
