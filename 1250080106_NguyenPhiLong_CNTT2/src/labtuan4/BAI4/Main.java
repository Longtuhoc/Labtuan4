package labtuan4.BAI4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HangDienMay dienMay = new HangDienMay("DM001", "Tivi", 5000000, 12, 220, 100);
        
        System.out.println("Nhap thong tin cho Hang Dien May:");
        dienMay.nhap();
        
        System.out.println("\nThong tin Hang Dien May:");
        dienMay.xuat();
        
        HangThucPham thucPham = new HangThucPham("TP001", "Gao", 20000, "01/03/2025", "01/09/2025");
        
        System.out.println("\nNhap thong tin cho Hang Thuc Pham:");
        thucPham.nhap();
        
        System.out.println("\nThong tin Hang Thuc Pham:");
        thucPham.xuat();
        
        scanner.close();
    }
}
