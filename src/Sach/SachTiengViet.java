// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Sach;

public class SachTiengViet extends Sach {
    private String tacGia;

    public SachTiengViet(String maSach, String tenSach, int namXuatBan, String tacGia) {
        super(maSach, tenSach, namXuatBan);
        this.tacGia = tacGia;
    }

    public String getTacGia() {
        return tacGia;
    }
}