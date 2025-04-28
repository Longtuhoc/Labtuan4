package labtuan4.BAI5;
import java.util.Scanner;

class SachVanHoc extends Sach {
    private int lanXuatBan;

    public SachVanHoc() {
        super();
        this.lanXuatBan = 0;
    }

    public SachVanHoc(String maSach, String tenSach, String tacGia, long gia, int lanXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lanXuatBan = lanXuatBan;
    }

    public int getLanXuatBan() { return lanXuatBan; }
    public void setLanXuatBan(int lanXuatBan) { this.lanXuatBan = lanXuatBan; }

    @Override
    public long getGiaSauGiam() {
        if (getGia() > 300000) {
            return (long)(getGia() * 0.8);
        }
        return getGia();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Lần xuất bản: " + lanXuatBan);
    }

    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhập lần xuất bản: ");
        this.lanXuatBan = scanner.nextInt();
        scanner.nextLine();
    }
}