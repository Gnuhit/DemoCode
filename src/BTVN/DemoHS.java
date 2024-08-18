package BTVN;

import java.util.Scanner;

public class DemoHS {
    public static void main(String[] args) {
        // Tạo một đối tượng học sinh
        HocSinh hs1 = new HocSinh();

        // Nhập thông tin cho học sinh
        hs1.input();

        // Xuất thông tin cùng xếp loại của học sinh
        System.out.println("Thông tin học sinh:");
        hs1.output();
        System.out.print("Xếp loại: ");
        hs1.rank();

        // Đổi tên của học sinh thành một tên mới được nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên mới: ");
        String tenMoi = scanner.nextLine();
        hs1.setHoTen(tenMoi);

        // Nhập thêm một học sinh
        HocSinh hs2 = new HocSinh();
        System.out.println("Nhập thông tin cho học sinh thứ 2:");
        hs2.input();

        // So sánh điểm trung bình và xuất ra tên của học sinh có điểm trung bình lớn hơn
        if (hs1.getDiemTrungBinh() > hs2.getDiemTrungBinh()) {
            System.out.println("Tên của học sinh có điểm trung bình lớn hơn: " + hs1.getHoTen());
        } else if (hs1.getDiemTrungBinh() < hs2.getDiemTrungBinh()) {
            System.out.println("Tên của học sinh có điểm trung bình lớn hơn: " + hs2.getHoTen());
        } else {
            System.out.println("Hai học sinh có điểm trung bình bằng nhau.");
        }
    }
}