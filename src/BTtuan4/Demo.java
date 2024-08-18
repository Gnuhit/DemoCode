package BTtuan4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng nhân viên: ");
		int slNhanvien = sc.nextInt();
		sc.nextLine();
		NhanVien nv1 = new NhanVien();
		nv1.nhapDulieuNV();
		nv1.xuatDulieuNV();
		nv1.luongNhanvien();
		
		NhanVien nv2 = new NhanVien("NV02", "Ngô Minh Hùng",10000,2.0f);
		nv2.xuatDulieuNV();
		nv2.luongNhanvien();
		
		NhanVien nv3 = new NhanVien(nv1);
		nv3.xuatDulieuNV();
		nv3.luongNhanvien();

		NhanVien SLNV = new NhanVien();
		System.out.println("Số lượng nhân viên: " + slNhanvien);
	}

}
