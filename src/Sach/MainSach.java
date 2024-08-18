// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSach {
	public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn thao tác:");
            System.out.println("1. Thêm sách");
            System.out.println("2. Xóa sách");
            System.out.println("3. Sửa sách");
            System.out.println("4. Sắp xếp giảm dần");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Tạo bản sao tự động");
            System.out.println("7. Hiển thị danh sách");
            System.out.println("8. Thoát");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập mã sách:");
                    String maSach = scanner.next();
                    System.out.println("Nhập tên sách:");
                    String tenSach = scanner.next();
                    System.out.println("Nhập năm xuất bản:");
                    int namXuatBan = scanner.nextInt();
                    Sach sach = new SachTiengViet(maSach, tenSach, namXuatBan, "Nguyễn Văn A");
                    qls.themSach(sach);
                    break;
                case 2:
                    System.out.println("Nhập mã sách cần xóa:");
                    maSach = scanner.next();
                    qls.xoaSach(maSach);
                    break;
                case 3:
                    System.out.println("Nhập mã sách cần sửa:");
                    maSach = scanner.next();
                    System.out.println("Nhập tên sách mới:");
                    tenSach = scanner.next();
                    System.out.println("Nhập năm xuất bản mới:");
                    namXuatBan = scanner.nextInt();
                    sach = new SachTiengViet(maSach, tenSach, namXuatBan, "Nguyễn Văn A");
                    qls.suaSach(maSach, sach);
                    break;
                case 4:
                    qls.sapXepGiamDan();
                    break;
                case 5:
                    System.out.println("Nhập mã sách cần tìm:");
                    maSach = scanner.next();
                    qls.timKiem(maSach);
                    break;
                case 6:
                    qls.taoBanSaoTuDong();
                    break;
                case 7:
                    qls.hienThiDanhSach();
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
