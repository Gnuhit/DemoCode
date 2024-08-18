// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Sach;

public class SachNgoaiNgu extends Sach {
    private String nguoiDich;

    public SachNgoaiNgu(String maSach, String tenSach, int namXuatBan, String nguoiDich) {
        super(maSach, tenSach, namXuatBan);
        this.nguoiDich = nguoiDich;
    }

    public String getNguoiDich() {
        return nguoiDich;
    }
}