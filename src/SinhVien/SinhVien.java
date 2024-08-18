// Ngô Minh Hùng - 2280601103 - 22DTHB4

package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    protected String maSV;
    protected String tenSV;
    protected int tuoi;

    public SinhVien(String maSV, String tenSV, int tuoi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoi = tuoi;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public int getTuoi() {
        return tuoi;
    }
}