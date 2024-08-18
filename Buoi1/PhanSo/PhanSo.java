// Ngô Minh Hùng - 2280601103 - 22DTHB4

package PhanSo;

import java.util.Scanner;

public class PhanSo {

    private int tuSo;
    private int mauSo;

    public PhanSo() {

    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo(PhanSo ps) {
        this.tuSo = ps.tuSo;
        this.mauSo = ps.mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tuSo = sc.nextInt();
        System.out.print("Nhap mau so: ");
        do {
            this.mauSo = sc.nextInt();
            if (mauSo == 0) {
                System.out.println("Mau so khong the bang 0. Vui long nhap lai!");
            }
        } while (mauSo == 0);
    }

    public void output() {
        System.out.println("Tử số và mẫu số: " + this.tuSo + "/" + this.mauSo);
    }
}