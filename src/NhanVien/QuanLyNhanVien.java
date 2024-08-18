// Ngô Minh Hùng - 2280601103 - 22DTHB4

package NhanVien;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSach;

    public QuanLyNhanVien() {
        danhSach = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv) {
        danhSach.add(nv);
    }

    public void xoaNhanVien(String maNV) {
        for (NhanVien nv : danhSach) {
            if (nv.getMaNV().equals(maNV)) {
                danhSach.remove(nv);
                break;
            }
        }
    }

    public void suaNhanVien(String maNV, NhanVien nv) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaNV().equals(maNV)) {
                danhSach.set(i, nv);
                break;
            }
        }
    }

    public void sapXepGiamDan() {
        danhSach.sort((nv1, nv2) -> nv2.getTuoi() - nv1.getTuoi());
    }

    public void timKiem(String maNV) {
        for (NhanVien nv : danhSach) {
            if (nv.getMaNV().equals(maNV)) {
                System.out.println("Tìm thấy nhân viên: " + nv.getTenNV());
                return;
            }
        }
        System.out.println("Không tìmthấy nhân viên");
    }

    public void taoBanSaoTuDong() {
        ArrayList<NhanVien> danhSachBanSao = new ArrayList<>();
        for (NhanVien nv : danhSach) {
            danhSachBanSao.add(new NhanVien(nv.getMaNV(), nv.getTenNV(), nv.getTuoi()));
        }
        System.out.println("Đã tạo bản sao tự động");
    }

    public void hienThiDanhSach() {
        for (NhanVien nv : danhSach) {
            System.out.println("Mã NV: " + nv.getMaNV() + ", Tên NV: " + nv.getTenNV() + ", Tuổi: " + nv.getTuoi());
        }
    }
}