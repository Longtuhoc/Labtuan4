package labtuan4.BAI5;
import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private long gia;

    public Sach() {
        this.maSach = "";
        this.tenSach = "";
        this.tacGia = "";
        this.gia = 0;
    }

    public Sach(String maSach, String tenSach, String tacGia, long gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public String getMaSach() { return maSach; }
    public String getTenSach() { return tenSach; }
    public String getTacGia() { return tacGia; }
    public long getGia() { return gia; }

    public void setMaSach(String maSach) { this.maSach = maSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    public void setGia(long gia) { this.gia = gia; }

    public long getGiaSauGiam() {
        return gia;
    }

    public void xuat() {
        System.out.println("Mã sách: " + maSach + ", Tên sách: " + tenSach + 
                         ", Tác giả: " + tacGia + ", Giá: " + gia);
    }

    public void nhap(Scanner scanner) {
        System.out.print("Nhập mã sách: ");
        this.maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        this.tenSach = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        this.tacGia = scanner.nextLine();
        System.out.print("Nhập giá sách: ");
        this.gia = scanner.nextLong();
        scanner.nextLine();
    }
}
