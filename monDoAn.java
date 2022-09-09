import java.util.Scanner;

public class monDoAn extends monHoc{
    private double diemGVHD;
    private double diemGVPB;

    Scanner sc = new Scanner(System.in);

    // --- constructor, set-get --- //
    public monDoAn() {
        setLoaiMon("Do An");
    }
    public void setDiemGVHD(double diemGVHD) {
        this.diemGVHD = diemGVHD;
    }
    public void setDiemGVPB(double diemGVPB) {
        this.diemGVPB = diemGVPB;
    }
    public double getDiemGVHD() {
        return diemGVHD;
    }
    public double getDiemGVPB() {
        return diemGVPB;
    }

    // --- methods ---- // 
    @Override
    public void nhapMon() {
        super.nhapMon();
        System.out.println("Nhap diem GVHD:");
        setDiemGVHD(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap diem GVPB:");
        setDiemGVPB(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public double tinhHocPhi() {
        return 2000000;
    }

    @Override
    public double tinhDiem() {
        return (diemGVHD*2 + diemGVPB)/3;
    } 
}
