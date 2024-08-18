// Ngô Minh Hùng - 2280601103 - 22DTHB4

package NhanVien;

public class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected int tuoi;

    public NhanVien(String maNV, String tenNV, int tuoi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }
}
