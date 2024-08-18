package BTVN;

import java.util.Scanner;

public class DanhSachCD {
    private CD[] danhSachCD;
    private int count;

    public DanhSachCD(int size) {
        danhSachCD = new CD[size];
        count = 0;
    }

    public void addCD(CD cd) {
        danhSachCD[count++] = cd;
    }

    public void input(int n) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho CD thứ " + (i + 1) + ":");
            System.out.print("Mã CD (là số nguyên > 0 và <= 999999): ");
            int maCD = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Tựa CD: ");
            String tuaCD = scanner.nextLine();

            System.out.print("Số bài hát (là số nguyên > 0): ");
            int soBaiHat = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Giá thành (là số thực > 0): ");
            double giaThanh = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            CD cd = new CD(maCD, tuaCD, soBaiHat, giaThanh);
            addCD(cd);
        }
    }

    public void output() {
        for (int i = 0; i < count; i++) {
            System.out.println("Mã CD: " + danhSachCD[i].getMaCD());
            System.out.println("Tựa CD: " + danhSachCD[i].getTuaCD());
            System.out.println("Số bài hát: " + danhSachCD[i].getSoBaiHat());
            System.out.println("Giá thành: " + danhSachCD[i].getGiaThanh());
            System.out.println();
        }
    }

    public void sortByMaCDDescending() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (danhSachCD[i].getMaCD() < danhSachCD[j].getMaCD()) {
                    CD temp = danhSachCD[i];
                    danhSachCD[i] = danhSachCD[j];
                    danhSachCD[j] = temp;
                }
            }
        }
    }
}