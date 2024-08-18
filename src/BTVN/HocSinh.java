package BTVN;

import java.util.Scanner;

class HocSinh {
    private int maSo;
    private String hoTen;
    private double diemTrungBinh;

    // Constructor
    public HocSinh() {
        this.maSo = 0;
        this.hoTen = "";
        this.diemTrungBinh = 0.0;
    }

    // Getter và Setter
    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    // Phương thức nhập thông tin từ bàn phím
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã số: ");
        this.maSo = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ kí tự '\n' trong buffer
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        this.diemTrungBinh = scanner.nextDouble();
    }

    // Phương thức xuất thông tin
    public void output() {
        System.out.println("Mã số: " + this.maSo);
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Điểm trung bình: " + this.diemTrungBinh);
    }

    // Phương thức xếp loại học sinh
    public void rank() {
        if (diemTrungBinh >= 8.0) {
            System.out.println("Xuất sắc");
        } else if (diemTrungBinh >= 7.0) {
            System.out.println("Giỏi");
        } else if (diemTrungBinh >= 6.0) {
            System.out.println("Khá");
        } else if (diemTrungBinh >= 5.0) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
}