package bt2;

public class NhanVienCC extends NhanVien {
    private String truongDaoTao, chuyenMon;

    public NhanVienCC(String maNV, String tenNv, String trinhDo, double luongCB, int namSinh, String truongDaoTao,
                      String chuyenMon) {
        super(maNV, tenNv, trinhDo, luongCB, namSinh);
        this.truongDaoTao = truongDaoTao;
        this.chuyenMon = chuyenMon;
    }

    public String getTruongDaoTao() {
        return truongDaoTao;
    }
    public void setTruongDaoTao(String truongDaoTao) {
        this.truongDaoTao = truongDaoTao;
    }
    public String getChuyenMon() {
        return chuyenMon;
    }
    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
}
