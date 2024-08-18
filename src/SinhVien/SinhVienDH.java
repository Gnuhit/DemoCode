// Ngô Minh Hùng - 2280601103 - 22DTHB4

package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienDH extends SinhVien {
    private String nganh;

    public SinhVienDH(String maSV, String tenSV, int tuoi, String nganh) {
        super(maSV, tenSV, tuoi);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }
}