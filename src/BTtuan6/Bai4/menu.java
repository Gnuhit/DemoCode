package BTT06;

import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		hocvien Hocvien =null;
		NVQL nvql = null;
		giaovien GV =null;
		 while (true) {
			 	System.out.println("1. Nhập thông tin học viên");
	            System.out.println("2. Nhập thông tin nhân viên quản lý");
	            System.out.println("3. Nhập thông tin giáo viên");
	            System.out.println("4. Xuất thông tin học viên");
	            System.out.println("5. Xuất thông tin nhân viên quản lý");
	            System.out.println("6. Xuất thông tin giáo viên");
	            System.out.println("7. Thoát");
	            int luaChon = scanner.nextInt();
	            scanner.nextLine();

	            switch (luaChon) {
	                case 1:
	                    System.out.print("Nhập tên học viên: ");
	                    String tenHocVien = scanner.nextLine();
	                    System.out.print("Nhập tuổi học viên: ");
	                    int tuoiHocVien = scanner.nextInt();
	                    Hocvien = new hocvien(tenHocVien, tuoiHocVien);
	                    break;
	                case 2:
	                    System.out.print("Nhập tên nhân viên quản lý: ");
	                    String tenNhanVien = scanner.nextLine();
	                    System.out.print("Nhập chức vụ nhân viên quản lý: ");
	                    String chucVuNhanVien = scanner.nextLine();
	                    nvql = new NVQL (tenNhanVien, chucVuNhanVien);
	                    break;
	                case 3:
	                    System.out.print("Nhập tên giáo viên: ");
	                    String tenGiaoVien = scanner.nextLine();
	                    System.out.print("Nhập môn học của giáo viên: ");
	                    String monHocGiaoVien = scanner.nextLine();
	                    GV = new giaovien(tenGiaoVien, monHocGiaoVien);
	                    break;
	                case 4:
	                    if (Hocvien != null) {
	                        System.out.println(Hocvien.getThongTin());
	                    } else {
	                        System.out.println("Chưa có thông tin học viên.");
	                    }
	                    break;
	                case 5:
	                    if (nvql != null) {
	                        System.out.println(nvql.getThongTin());
	                    } else {
	                        System.out.println("Chưa có thông tin nhân viên quản lý.");
	                    }
	                    break;
	                case 6:
	                    if (GV != null) {
	                        System.out.println(GV.getThongTin());
	                    } else {
	                        System.out.println("Chưa có thông tin giáo viên.");
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

