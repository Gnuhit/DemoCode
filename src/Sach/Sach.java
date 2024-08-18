// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Sach;

public class Sach {
    protected String maSach;
    protected String tenSach;
    protected int namXuatBan;

    public Sach(String maSach, String tenSach, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }
}
