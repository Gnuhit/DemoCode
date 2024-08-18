package BTtuan6;

import java.util.*;
import java.io.*;

public class CD {
    private int maCD;
    private String tenCD;
    private String caSi;
    private int soBaiHat;
    private double giaThanh;

    public CD() {}

    public CD(int maCD, String tenCD, String caSi, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        CD cd = (CD) obj;
        return maCD == cd.maCD &&
                soBaiHat == cd.soBaiHat &&
                Double.compare(cd.giaThanh, giaThanh) == 0 &&
                Objects.equals(tenCD, cd.tenCD) &&
                Objects.equals(caSi, cd.caSi);
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tenCD='" + tenCD + '\'' +
                ", caSi='" + caSi + '\'' +
                ", soBaiHat=" + soBaiHat +
                ", giaThanh=" + giaThanh +
                '}';
    }
}