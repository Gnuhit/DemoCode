package BTtuan6;

import java.util.ArrayList;
import java.util.Collections;

public class CDCollection {
    private ArrayList<CD> cds;
    private int soLuongCD;
    private double tongGiaThanh;

    public CDCollection() {
        cds = new ArrayList<>();
        soLuongCD = 0;
        tongGiaThanh = 0;
    }

    public void themCD(CD cd) {
        cds.add(cd);
        soLuongCD++;
        tongGiaThanh += cd.getGiaThanh();
    }

    public void xoaCD(CD cd) {
        if (cds.contains(cd)) {
            cds.remove(cd);
            soLuongCD--;
            tongGiaThanh -= cd.getGiaThanh();
        }
    }

    public CD timKiemCD(int maCD) {
        for (CD cd : cds) {
            if (cd.getMaCD() == maCD) {
                return cd;
            }
        }
        return null;
    }

    public void sapXepCD() {
        Collections.sort(cds, (cd1, cd2) -> Integer.compare(cd1.getMaCD(), cd2.getMaCD()));
    }

    public void inDanhSachCD() {
        for (CD cd : cds) {
            System.out.println(cd.toString());
        }
    }

    public int getSoLuongCD() {
        return soLuongCD;
    }

    public double getTongGiaThanh() {
        return tongGiaThanh;
    }
}