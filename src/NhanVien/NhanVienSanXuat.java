// Ngô Minh Hùng - 2280601103 - 22DTHB4

package NhanVien;

public class NhanVienSanXuat extends NhanVien {
    private String congViec;

    public NhanVienSanXuat(String maNV, String tenNV, int tuoi, String congViec) {
        super(maNV, tenNV, tuoi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }
}