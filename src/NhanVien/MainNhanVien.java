// Ngô Minh Hùng - 2280601103 - 22DTHB4

package NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class MainNhanVien {
	public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn thao tác:");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Sửa nhân viên");
            System.out.println("4. Sắp xếp giảm dần");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Tạo bản sao tự động");
            System.out.println("7. Hiển thị danh sách");
            System.out.println("8. Thoát");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập mã NV:");
                    String maNV = scanner.next();
                    System.out.println("Nhập tên NV:");
                    String tenNV = scanner.next();
                    System.out.println("Nhập tuổi:");
                    int tuoi = scanner.nextInt();
                    NhanVien nv = new NhanVienVanPhong(maNV, tenNV, tuoi, "Trưởng phòng");
                    qlnv.themNhanVien(nv);
                    break;
                case 2:
                    System.out.println("Nhập mã NV cần xóa:");
                    maNV = scanner.next();
                    qlnv.xoaNhanVien(maNV);
                    break;
                case 3:
                    System.out.println("Nhập mã NV cần sửa:");
                    maNV = scanner.next();
                    System.out.println("Nhập tên NV mới:");
                    tenNV = scanner.next();
                    System.out.println("Nhập tuổi mới:");
                    tuoi = scanner.nextInt();
                    nv = new NhanVienVanPhong(maNV, tenNV, tuoi, "Trưởng phòng");
                    qlnv.suaNhanVien(maNV, nv);
                    break;
                case 4:
                    qlnv.sapXepGiamDan();
                    break;
                case 5:
                    System.out.println("Nhập mã NV cần tìm:");
                    maNV = scanner.next();
                    qlnv.timKiem(maNV);
                    break;
                case 6:
                    qlnv.taoBanSaoTuDong();
                    break;
                case 7:
                    qlnv.hienThiDanhSach();
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
