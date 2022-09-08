import java.util.Scanner;

public class danhSachSinhVien {
    private sinhVien[] dssv;
    private int n;

    Scanner sc = new Scanner(System.in);

    public danhSachSinhVien() {};
    public void setDssv(sinhVien[] dssv) {
        this.dssv = dssv;
    }
    public sinhVien[] getDssv() {
        return dssv;
    }

    public void nhapdssv() {
        System.out.println("Nhap so sinh vien:");
        n = Integer.parseInt(sc.nextLine());
        dssv = new sinhVien[n];
        for (int i = 0; i < dssv.length; i++) {
            dssv[i] = new sinhVien();
            dssv[i].nhapsv();
        }
    }

    public void xuatdssv() {
        for (int i = 0; i < dssv.length; i++) {
            System.out.println(dssv[i].toString());
        }
    }
}
