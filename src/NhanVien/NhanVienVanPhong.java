// Ngô Minh Hùng - 2280601103 - 22DTHB4

package NhanVien;

public class NhanVienVanPhong extends NhanVien {
    private String chucVu;

    public NhanVienVanPhong(String maNV, String tenNV, int tuoi, String chucVu) {
        super(maNV, tenNV, tuoi);
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }
}