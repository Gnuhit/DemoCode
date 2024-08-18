package BTT06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  List<HV> danhSachHocVien = new ArrayList<>();
	        List<NVQuanLy> danhSachNhanVienQuanLy = new ArrayList<>();
	        List<GV> danhSachGiaoVien = new ArrayList<>();
	        while (true) {
	            System.out.println("1. Nhập thông tin học viên");
	            System.out.println("2. Nhập thông tin nhân viên quản lý");
	            System.out.println("3. Nhập thông tin giáo viên");
	            System.out.println("4. Xuất danh sách học viên");
	            System.out.println("5. Xuất danh sách nhân viên quản lý");
	            System.out.println("6. Xuất danh sách giáo viên");
	            System.out.println("7. Thoát");

	            int luaChon = scanner.nextInt();
	            scanner.nextLine();

	            switch (luaChon) {
	                case 1:
	                    System.out.print("Nhập tên học viên: ");
	                    String tenHocVien = scanner.nextLine();
	                    System.out.print("Nhập tuổi học viên: ");
	                    int tuoiHocVien = scanner.nextInt();
	                    danhSachHocVien.add(new HV(tenHocVien, tuoiHocVien));
	                    break;
	                case 2:
	                    System.out.print("Nhập tên nhân viên quản lý: ");
	                    String tenNhanVien = scanner.nextLine();
	                    System.out.print("Nhập chức vụ nhân viên quản lý: ");
	                    String chucVuNhanVien = scanner.nextLine();
	                    danhSachNhanVienQuanLy.add(new NVQuanLy(tenNhanVien, chucVuNhanVien));
	                    break;
	                case 3:
	                    System.out.print("Nhập tên giáo viên: ");
	                    String tenGiaoVien = scanner.nextLine();
	                    System.out.print("Nhập môn học của giáo viên: ");
	                    String monHocGiaoVien = scanner.nextLine();
	                    danhSachGiaoVien.add(new GV(tenGiaoVien, monHocGiaoVien));
	                    break;
	                case 4:
	                    System.out.println("Danh sách học viên:");
	                    for (HV hocVien : danhSachHocVien) {
	                        System.out.println(hocVien.getThongTin());
	                    }
	                    break;
	                case 5:
	                    System.out.println("Danh sách nhân viên quản lý:");
	                    for (NVQuanLy nhanVienQuanLy : danhSachNhanVienQuanLy) {
	                        System.out.println(nhanVienQuanLy.getThongTin());
	                    }
	                    break;
	                case 6:
	                    System.out.println("Danh sách giáo viên:");
	                    for (GV giaoVien : danhSachGiaoVien) {
	                        System.out.println(giaoVien.getThongTin());
	                    }
	                    break;
	                case 7:
	                    System.out.println("Kết thúc chương trình.");
	                    return;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	            }
	        }
	    }
}

