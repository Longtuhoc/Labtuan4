package labtuan4.BAI5;

import java.util.Scanner;

class SachGiaoKhoa extends Sach {
    private int lop;
    private String nhaXuatBan;

    public SachGiaoKhoa() {
        super();
        this.lop = 0;
        this.nhaXuatBan = "";
    }

    public SachGiaoKhoa(String maSach, String tenSach, String tacGia, long gia, int lop, String nhaXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getLop() { return lop; }
    public String getNhaXuatBan() { return nhaXuatBan; }

    public void setLop(int lop) { this.lop = lop; }
    public void setNhaXuatBan(String nhaXuatBan) { this.nhaXuatBan = nhaXuatBan; }

    @Override
    public long getGiaSauGiam() {
        if (nhaXuatBan.equalsIgnoreCase("Giáo Dục")) {
            return (long)(getGia() * 0.9);
        }
        return getGia();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Lớp: " + lop + ", Nhà xuất bản: " + nhaXuatBan);
    }

    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhập lớp: ");
        this.lop = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        this.nhaXuatBan = scanner.nextLine();
    }
}