package bt2;

public class Demo {

    public static void main(String[] args) {
        NhanVienQL nvql = new NhanVienQL("123", "NVA", "DAIHOC", 7000, 1985, "HCMUT", "Computer Science", 500);
        NhanVienPhucVu nvpv = new NhanVienPhucVu("456", "NVB", "CAODANG", 4000, 1990);
        NhanVienNghienCuu nvnc = new NhanVienNghienCuu("789", "NVC", "TIENSI", 9000, 1980, "HUST", "Physics", 700);

    System.out.println("Nhân viên quản lý: " + nvql.getTenNv());
    System.out.println("Nhân viên phục vụ: " + nvpv.getTenNv());
     System.out.println("Nhân viên nghiên cứu: " + nvnc.getTenNv());
    }
}
