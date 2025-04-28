package labtuan4.BAI4;
import java.util.Scanner;

class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham() {
        super();
        this.ngaySanXuat = "";
        this.ngayHetHan = "";
    }

    public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }
    
    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }
    
    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat (dd/mm/yyyy): ");
        ngaySanXuat = scanner.nextLine();
        System.out.print("Nhap ngay het han (dd/mm/yyyy): ");
        ngayHetHan = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Ngay het han: " + ngayHetHan);
    }
}
