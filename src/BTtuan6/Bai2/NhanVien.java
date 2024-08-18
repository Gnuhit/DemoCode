package bt2;

public class NhanVien {
    private String maNV, tenNv, trinhDo;
    private double luongCB;
    private int namSinh;

    public NhanVien(String maNV, String tenNv, String trinhDo, double luongCB, int namSinh) {
        this.maNV = maNV;
        this.tenNv = tenNv;
        this.trinhDo = trinhDo;
        this.luongCB = luongCB;
        this.namSinh = namSinh;
    }

    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getTenNv() {
        return tenNv;
    }
    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }
    public String getTrinhDo() {
        return trinhDo;
    }
    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    public double getLuongCB() {
        return luongCB;
    }
    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
