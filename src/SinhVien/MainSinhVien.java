// Ngô Minh Hùng - 2280601103 - 22DTHB4

package SinhVien;

import java.util.Scanner;

public class MainSinhVien {
	public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn thao tác:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Sắp xếp giảm dần");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Tạo bản sao tự động");
            System.out.println("7. Hiển thị danh sách");
            System.out.println("8. Thoát");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập mã SV:");
                    String maSV = scanner.next();
                    System.out.println("Nhập tên SV:");
                    String tenSV = scanner.next();
                    System.out.println("Nhập tuổi:");
                    int tuoi = scanner.nextInt();
                    SinhVien sv = new SinhVienDH(maSV, tenSV, tuoi,"Ngành DH");
                    qlsv.themSinhVien(sv);
                    break;
                case 2:
                    System.out.println("Nhập mã SV cần xóa:");
                    maSV = scanner.next();
                    qlsv.xoaSinhVien(maSV);
                    break;
                case 3:
                    System.out.println("Nhập mã SV cần sửa:");
                    maSV = scanner.next();
                    System.out.println("Nhập tên SV mới:");
                    tenSV = scanner.next();
                    System.out.println("Nhập tuổi mới:");
                    tuoi = scanner.nextInt();
                    sv = new SinhVienDH(maSV, tenSV, tuoi, "Ngành DH");
                    qlsv.suaSinhVien(maSV, sv);
                    break;
                case 4:
                    qlsv.sapXepGiamDan();
                    break;
                case 5:
                    System.out.println("Nhập mã SV cần tìm:");
                    maSV = scanner.next();
                    qlsv.timKiem(maSV);
                    break;
                case 6:
                    qlsv.taoBanSaoTuDong();
                    break;
                case 7:
                    qlsv.hienThiDanhSach();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn thao tác không hợp lệ");
            }
        }
    }
}
