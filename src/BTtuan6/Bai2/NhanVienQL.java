package bt2;

public class NhanVienQL extends NhanVienCC {
    private double phuCapChucVu;

    public NhanVienQL(String maNV, String tenNv, String trinhDo, double luongCB, int namSinh, String truongDaoTao,
                      String chuyenMon, double phuCapChucVu) {
        super(maNV, tenNv, trinhDo, luongCB, namSinh, truongDaoTao, chuyenMon);
        this.phuCapChucVu = phuCapChucVu;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }
    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }
}
