package bt2;

public class NhanVienNghienCuu extends NhanVienCC {
    private double phuCapDocHai;

    public NhanVienNghienCuu(String maNV, String tenNv, String trinhDo, double luongCB, int namSinh,
                             String truongDaoTao, String chuyenMon, double phuCapDocHai) {
        super(maNV, tenNv, trinhDo, luongCB, namSinh, truongDaoTao, chuyenMon);
        this.phuCapDocHai = phuCapDocHai;
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }
    public void setPhuCapDocHai(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }
}
