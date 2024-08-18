package BTtuan4;

import java.util.*;
import java.io.*;

public class NhanVien{
	private String maSo;
	private String hoTen;
	private int luongCoban;
	private float heSoluong;
	private int slNhanvien;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String maSo, String hoTen, int luongCoban, float heSoluong) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.luongCoban = luongCoban;
		this.heSoluong = heSoluong;
	}
	
	public NhanVien(NhanVien obj) {
		this.maSo = obj.maSo;
		this.hoTen = obj.hoTen;
		this.luongCoban = obj.luongCoban;
		this.heSoluong = obj.heSoluong;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getHeSoluong() {
		return heSoluong;
	}

	public void setHeSoluong(float heSoluong) {
		this.heSoluong = heSoluong;
	}
	
	public void nhapDulieuNV() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhập mã nhân viên: ");
		maSo = sc.nextLine();
		System.out.print("Nhâp tên nhân viên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập lương cơ bản: ");
		luongCoban = sc.nextInt();
		System.out.print("Nhập hệ số lương: ");
		heSoluong = sc.nextFloat();
		sc.nextLine();
	}
	
	public void xuatDulieuNV() {
		System.out.println("Mã số: " + maSo);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Lương cơ bản: " + luongCoban);
		System.out.println("Hệ số lương: " + heSoluong);
	}
	
	public void luongNhanvien() {
		double luongNhanvien = luongCoban * heSoluong;
		System.out.println("Lương nhân viên: " + luongNhanvien);
	}
	
//	public void inSLNV() {
//		Scanner sc = new Scanner (System.in);
//		System.out.print("Nhập số lượng nhân viên: ");
//		slNhanvien = sc.nextInt();
//		System.out.println("Số lượng nhân viên: " + slNhanvien);
//	}
}