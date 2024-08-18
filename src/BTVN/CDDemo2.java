package BTVN;

import java.util.Scanner;

public class CDDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo một đối tượng CD
        CD cd1 = new CD();

        // Nhập thông tin cho CD
        System.out.println("Nhập thông tin cho CD thứ nhất:");
        cd1.input();

        // Xuất thông tin CD
        System.out.println("\nThông tin CD thứ nhất:");
        cd1.output();

        // Đổi giá thành của CD khi biết mã CD
        System.out.println("\nNhập mã CD cần đổi giá thành:");
        int maCD = scanner.nextInt();
        if (cd1.getMaCD() == maCD) {
            System.out.println("Nhập giá thành mới:");
            double newPrice = scanner.nextDouble();
            cd1.setGiaThanh(newPrice);
            System.out.println("Đã cập nhật giá thành mới cho CD có mã " + maCD);
            System.out.println("Thông tin sau khi cập nhật:");
            cd1.output();
        } else {
            System.out.println("Không tìm thấy CD có mã " + maCD);
        }

        // Nhập thêm một CD và so sánh số bài hát
        System.out.println("\nNhập thông tin cho CD thứ hai:");
        CD cd2 = new CD();
        cd2.input();

        if (cd2.getSoBaiHat() > cd1.getSoBaiHat()) {
            System.out.println("CD thứ hai có số bài hát nhiều hơn CD thứ nhất.");
            System.out.println("Thông tin CD thứ hai:");
            cd2.output();
        } else if (cd2.getSoBaiHat() < cd1.getSoBaiHat()) {
            System.out.println("CD thứ nhất có số bài hát nhiều hơn CD thứ hai.");
            System.out.println("Thông tin CD thứ nhất:");
            cd1.output();
        } else {
            System.out.println("Cả hai CD có số bài hát bằng nhau.");
        }
    }
}