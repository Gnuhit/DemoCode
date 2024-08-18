package BTtuan6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CDCollection collection = new CDCollection();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Nhập danh sách CD");
            System.out.println("2. In danh sách CD");
            System.out.println("3. Nhập thông tin 1 CD");
            System.out.println("4. In thông tin 1 CD");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng CD: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập mã CD " + (i + 1) + ": ");
                        int maCD = scanner.nextInt();
                        System.out.print("Nhập tên CD " + (i + 1) + ": ");
                        String tenCD = scanner.next();
                        System.out.print("Nhập ca sỹ " + (i + 1) + ": ");
                        String caSi = scanner.next();
                        System.out.print("Nhập số bài hát " + (i + 1) + ": ");
                        int soBaiHat = scanner.nextInt();
                        System.out.print("Nhập giá thành " + (i + 1) + ": ");
                        double giaThanh = scanner.nextDouble();
                        CD cd = new CD(maCD, tenCD, caSi, soBaiHat, giaThanh);
                        collection.themCD(cd);
                    }
                    break;
                case 2:
                    collection.inDanhSachCD();
                    break;
                case 3:
                    System.out.print("Nhập mã CD: ");
                    int maCD = scanner.nextInt();
                    System.out.print("Nhập tên CD: ");
                    String tenCD = scanner.next();
                    System.out.print("Nhập ca sỹ: ");
                    String caSi = scanner.next();
                    System.out.print("Nhập số bài hát: ");
                    int soBaiHat = scanner.nextInt();
                    System.out.print("Nhập giá thành: ");
                    double giaThanh = scanner.nextDouble();
                    CD cd = new CD(maCD, tenCD, caSi, soBaiHat, giaThanh);
                    collection.themCD(cd);
                    break;
                case 4:
                    System.out.print("Nhập mã CD: ");
                    int maCD2 = scanner.nextInt();
                    CD cd2 = collection.timKiemCD(maCD2);
                    if (cd2!= null) {
                        System.out.println(cd2.toString());
                    } else {
                        System.out.println("Không tìm thấy CD");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ");
            }
        }
    }
}