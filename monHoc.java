import java.util.Scanner;

public abstract class monHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private int soTinChi;
    private String khoaPhuTrach;
    private String loaiMon;

    Scanner sc = new Scanner(System.in);

    public monHoc() {}
    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    public void setKhoaPhuTrach(String khoaPhuTrach) {
        this.khoaPhuTrach = khoaPhuTrach;
    }
    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }
    public String getMaMonHoc() {
        return maMonHoc;
    }
    public String getTenMonHoc() {
        return tenMonHoc;
    }
    public int getSoTinChi() {
        return soTinChi;
    }
    public String getKhoaPhuTrach() {
        return khoaPhuTrach;
    }
    public String getLoaiMon() {
        return loaiMon;
    }

    public void nhapMon() {
        System.out.println("Nhap ma mon:");
        setMaMonHoc(sc.nextLine());
        System.out.println("Nhap ten mon:");
        setTenMonHoc(sc.nextLine());
        System.out.println("Nhap so tin chi:");
        setSoTinChi(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap khoa phu trach:");
        setKhoaPhuTrach(sc.nextLine());
    }

    public abstract double tinhHocPhi();

    public abstract double tinhDiem();
}