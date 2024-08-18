// Ngô Minh Hùng - 2280601103 - 22DTHB4

package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienCD extends SinhVien {
    private String chuyenNganh;

    public SinhVienCD(String maSV, String tenSV, int tuoi, String chuyenNganh) {
        super(maSV, tenSV, tuoi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }
}