package BTVN;

import java.util.Scanner;

class DanhSachHocSinh {
    private HocSinh[] danhSach;
    private int soLuong;

    public DanhSachHocSinh(int maxSize) {
        danhSach = new HocSinh[maxSize];
        soLuong = 0;
    }

    // Phương thức nhập danh sách học sinh
    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ kí tự '\n' trong buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho học sinh thứ " + (i + 1) + ":");
            HocSinh hs = new HocSinh();
            hs.input();
            danhSach[soLuong++] = hs;
        }
    }

    // Phương thức in danh sách học sinh
    public void inDanhSach() {
        System.out.println("Danh sách học sinh:");
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Học sinh thứ " + (i + 1) + ":");
            danhSach[i].output();
            System.out.println();
        }
    }

    // Phương thức sắp xếp danh sách học sinh giảm dần theo điểm trung bình
    public void sapXepDanhSach() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (danhSach[i].getDiemTrungBinh() < danhSach[j].getDiemTrungBinh()) {
                    HocSinh temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
    }
}

