package BTVN;

public class DemoQLHS {
    public static void main(String[] args) {
        // Tạo một đối tượng danh sách học sinh
        DanhSachHocSinh ds = new DanhSachHocSinh(100);

        // Nhập thông tin cho danh sách học sinh
        ds.nhapDanhSach();

        // In danh sách học sinh
        System.out.println("Danh sách học sinh trước khi sắp xếp:");
        ds.inDanhSach();

        // Sắp xếp danh sách học sinh theo thứ tự giảm dần của điểm trung bình
        ds.sapXepDanhSach();

        // In danh sách học sinh sau khi sắp xếp
        System.out.println("\nDanh sách học sinh sau khi sắp xếp:");
        ds.inDanhSach();
    }
}