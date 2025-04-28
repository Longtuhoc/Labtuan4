package labtuan4.BAI4;
import java.util.Scanner;

class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;

    public HangDienMay() {
        super();
        this.thoiGianBaoHanh = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }

    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    
    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getDienAp() {
        return dienAp;
    }
    
    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }
    
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh (thang): ");
        thoiGianBaoHanh = scanner.nextInt();
        System.out.print("Nhap dien ap (V): ");
        dienAp = scanner.nextInt();
        System.out.print("Nhap cong suat (W): ");
        congSuat = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh + " thang");
        System.out.println("Dien ap: " + dienAp + " V");
        System.out.println("Cong suat: " + congSuat + " W");
    }
}