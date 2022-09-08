import java.util.Scanner;

public class monLyThuyet extends monHoc {
    private double diemTieuLuan;
    private double diemGiuaKy;
    private double diemCuoiKy;

    Scanner sc = new Scanner(System.in);

    public monLyThuyet() {
        setLoaiMon("Ly Thuyet");
    }
    public void setDiemLyThuyet(double tl, double gk, double ck) {
        this.diemTieuLuan = tl;
        this.diemGiuaKy = gk;
        this.diemCuoiKy = ck;
    }
    public double getDiemTieuLuan() {
        return diemTieuLuan;
    }
    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }
    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    @Override
    public void nhapMon() {
        super.nhapMon();
        System.out.println("Nhap diem tieu luan:");
        double tl = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem giua ky:");
        double gk = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem cuoi ky:");
        double ck = Double.parseDouble(sc.nextLine());
        setDiemLyThuyet(tl, gk, ck);
    }

    @Override
    public double tinhHocPhi() {
        return 250000*getSoTinChi();
    }

    @Override
    public double tinhDiem() {
        return (0.2*diemTieuLuan + 0.3*diemGiuaKy + 0.5*diemCuoiKy);
    }
}
