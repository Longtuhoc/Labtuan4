package labtuan4.BAI5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        SachVanHoc vanHoc = new SachVanHoc("VH001", "Truyện Kiều", "Nguyễn Du", 400000, 5);
        SachGiaoKhoa giaoKhoa = new SachGiaoKhoa("GK001", "Toán 10", "Hoàng Xuân", 250000, 10, "Giáo Dục");

        danhSachSach.add(vanHoc);
        danhSachSach.add(giaoKhoa);

        System.out.println("\nNhập thông tin cho các quyển sách:");
        System.out.println("1. Sách văn học");
        System.out.println("2. Sách giáo khoa");
        System.out.print("Chọn loại sách (0 để kết thúc): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        while (choice != 0) {
            Sach sach;
            if (choice == 1) {
                sach = new SachVanHoc();
            } else if (choice == 2) {
                sach = new SachGiaoKhoa();
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }
            
            sach.nhap(scanner);
            danhSachSach.add(sach);
            
            System.out.print("Chọn loại sách (0 để kết thúc): ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nThông tin các quyển sách sau khi giảm giá:");
        for (Sach sach : danhSachSach) {
            sach.xuat();
            System.out.println("Giá sau giảm: " + sach.getGiaSauGiam());
            System.out.println("----------------------");
        }

        if (!danhSachSach.isEmpty()) {
            Sach sachGiaMax = danhSachSach.get(0);
            for (Sach sach : danhSachSach) {
                if (sach.getGiaSauGiam() > sachGiaMax.getGiaSauGiam()) {
                    sachGiaMax = sach;
                }
            }
            System.out.println("\nSách có giá lớn nhất sau khi giảm: ");
            sachGiaMax.xuat();
            System.out.println("Giá sau giảm: " + sachGiaMax.getGiaSauGiam());
        } else {
            System.out.println("\nDanh sách sách trống!");
        }
        
        scanner.close();
    }
}
