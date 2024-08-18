package BTVN;

import java.util.Scanner;

public class DemoQLCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng CD: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        DanhSachCD danhSachCD = new DanhSachCD(n);
        danhSachCD.input(n);

        System.out.println("Thông tin CD trước khi sắp xếp:");
        danhSachCD.output();

        danhSachCD.sortByMaCDDescending();
        System.out.println("Thông tin CD sau khi sắp xếp giảm dần theo mã CD:");
        danhSachCD.output();
    }
}