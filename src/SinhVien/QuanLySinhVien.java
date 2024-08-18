// Ngô Minh Hùng - 2280601103 - 22DTHB4

package SinhVien;

import java.util.ArrayList;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSach;

    public QuanLySinhVien() {
        danhSach = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv) {
        danhSach.add(sv);
    }

    public void xoaSinhVien(String maSV) {
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV().equals(maSV)) {
                danhSach.remove(sv);
                break;
            }
        }
    }

    public void suaSinhVien(String maSV, SinhVien sv) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSV().equals(maSV)) {
                danhSach.set(i, sv);
                break;
            }
        }
    }

    public void sapXepGiamDan() {
        danhSach.sort((sv1, sv2) -> sv2.getTuoi() - sv1.getTuoi());
    }

    public void timKiem(String maSV) {
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV().equals(maSV)) {
                System.out.println("Tìm thấy sinh viên: " + sv.getTenSV());
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên");
    }

    public void taoBanSaoTuDong() {
        ArrayList<SinhVien> danhSachBanSao = new ArrayList<>();
        for (SinhVien sv : danhSach) {
            danhSachBanSao.add(new SinhVien(sv.getMaSV(), sv.getTenSV(), sv.getTuoi()));
        }
        System.out.println("Đã tạo bản sao tự động");
    }
    public void hienThiDanhSach() {
        for (SinhVien sv : danhSach) {
            System.out.println("Mã SV: " + sv.getMaSV() + ", Tên SV: " + sv.getTenSV() + ", Tuổi: " + sv.getTuoi());
        }
    }
}