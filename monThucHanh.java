import java.util.Scanner;

public class monThucHanh extends monHoc{
    private double diem1;
    private double diem2;
    private double diem3;
    private double diem4;

    Scanner sc = new Scanner(System.in);

    // --- constructor, set-get --- //
    public monThucHanh() {
        setLoaiMon("Thuc Hanh");
    }
    public void setDiemThucHanh(double d1, double d2, double d3, double d4) {
        this.diem1 = d1;
        this.diem2 = d2;
        this.diem3 = d3;
        this.diem4 = d4;
    }

    // --- methods ---- //
    @Override
    public void nhapMon() {
        super.nhapMon();
        System.out.print("Nhap cot diem 1:");
        double d1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap cot diem 2:");
        double d2 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap cot diem 3:");
        double d3 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap cot diem 4:");
        double d4 = Double.parseDouble(sc.nextLine());
        setDiemThucHanh(d1, d2, d3, d4);
    }

    @Override
    public double tinhHocPhi() {
        return (100000 + 350000*getSoTinChi());
    }

    @Override
    public double tinhDiem() {
        return (diem1 + diem2 + diem3 + diem4)/4;
    }
}
