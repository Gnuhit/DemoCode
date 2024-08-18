package Arr_CX;

import java.util.Scanner;

public class ChuyenXe {
    private String maCX;
    private String hoTenTX;
    private int soXe;
    private double doanhThu;

    public String getMaCX() {
        return maCX;
    }

    public void setMaCX(String maCX) {
        this.maCX = maCX;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        if (doanhThu > 0)
            this.doanhThu = doanhThu;
    }

    public ChuyenXe() {
    }

    public ChuyenXe(String maCX, String hoTenTX, int soXe, double doanhThu) {
        this.maCX = maCX;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        setDoanhThu(doanhThu);
    }

    public ChuyenXe(ChuyenXe cx) {
        this.maCX = cx.maCX;
        this.hoTenTX = cx.hoTenTX;
        this.soXe = cx.soXe;
        this.doanhThu = cx.doanhThu;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập mã chuyến xe: ");
        maCX = sc.nextLine();
        System.out.println("Nhập họ tên tài xế: ");
        hoTenTX = sc.nextLine();
        System.out.println("Nhập số xe: ");
        soXe = sc.nextInt();
        System.out.println("Nhập doanh thu: ");
        doanhThu = sc.nextDouble();
        setDoanhThu(doanhThu);
    }

    public String xuat() {
        return maCX + "\t" + hoTenTX + "\t" + soXe + "\t" + doanhThu;
    }
}




