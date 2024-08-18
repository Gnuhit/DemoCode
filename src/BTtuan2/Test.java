package BTtuan2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soLuongSV;
        do {
            System.out.print("Nhập số lượng sinh viên muốn nhập: ");
            soLuongSV = Integer.parseInt(sc.nextLine());
        } while (soLuongSV <= 0);

        SinhVien[] dsSinhVien = new SinhVien[soLuongSV];

        for (int i = 0; i < soLuongSV; i++) {
        	System.out.print("Nhập mã sinh viên: ");
        	String maSV = sc.nextLine();
        	System.out.print("Nhập tên sinh viên: ");
        	String tenSV = sc.nextLine();
        	System.out.print("Nhập lớp: ");
        	String lop = sc.nextLine();
        	System.out.print("Nhập điểm T: ");
        	float diemT = Float.parseFloat(sc.nextLine());
        	System.out.print("Nhập điểm L: ");
        	float diemL = Float.parseFloat(sc.nextLine());
        	System.out.print("Nhập điểm H: ");
        	float diemH = Float.parseFloat(sc.nextLine());
        	
        	dsSinhVien[i] = new SinhVien(maSV, tenSV, lop, diemT, diemL, diemH);
        }
        
        System.out.println("\nDanh sách sinh viên:");
        for (SinhVien sv : dsSinhVien) {
            sv.xuatTT();
            float dtb = sv.tinhDTB();
            System.out.println("Điểm TB: " + dtb);
            System.out.println("-----------------------");
        }
    }
}
