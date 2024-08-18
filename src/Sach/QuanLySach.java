// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    public void xoaSach(String maSach) {
        for (Sach sach : danhSach) {
            if (sach.getMaSach().equals(maSach)) {
                danhSach.remove(sach);
                break;
            }
        }
    }

    public void suaSach(String maSach, Sach sach) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equals(maSach)) {
                danhSach.set(i, sach);
                break;
            }
        }
    }

    public void sapXepGiamDan() {
        danhSach.sort((sach1, sach2) -> sach2.getNamXuatBan() - sach1.getNamXuatBan());
    }

    public void timKiem(String maSach) {
        for (Sach sach : danhSach) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println("Tìm thấy sách: " + sach.getTenSach());
                return;
            }
        }
        System.out.println("Không tìm thấy sách");
    }

    public void taoBanSaoTuDong() {
        ArrayList<Sach> danhSachBanSao = new ArrayList<>();
        for (Sach sach : danhSach) {
            danhSachBanSao.add(new Sach(sach.getMaSach(), sach.getTenSach(), sach.getNamXuatBan()));
        }
        System.out.println("Đã tạo bản sao tự động");
    }

    public void hienThiDanhSach() {
        for (Sach sach : danhSach) {
            System.out.println("Mã sách: " + sach.getMaSach() + ", Tên sách: " + sach.getTenSach() + ", Năm xuất bản: " + sach.getNamXuatBan());
        }
    }
}