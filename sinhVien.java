import java.util.Scanner;

public class sinhVien {
    private String maSv;
    private String tenSV;
    private danhSachMonHoc dsMonHoc;

    Scanner sc = new Scanner(System.in);

    public sinhVien() {}

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public String getMaSv() {
        return maSv;
    }
    public String getTenSV() {
        return tenSV;
    }

    public void nhapsv() {
        System.out.println("Nhap ma sv:");
        setMaSv(sc.nextLine());
        System.out.println("Nhap ten sv:");
        setTenSV(sc.nextLine());
        dsMonHoc = new danhSachMonHoc();
        dsMonHoc.nhapdsmh();
    }

    public double tinhHocPhiSV() {
        double tongTien = 0;
        for (int i = 0; i < dsMonHoc.getDsmonhoc().length; i++) {
            tongTien += dsMonHoc.getDsmonhoc()[i].tinhHocPhi();
        }
        return tongTien;
    }

    public double tinhDiemTichLuy() {
        double tongDiem = 0, tongTinChi = 0;
        for (int i = 0; i < dsMonHoc.getDsmonhoc().length; i++) {
            monHoc mh = dsMonHoc.getDsmonhoc()[i];
            tongDiem += (mh.tinhDiem()*mh.getSoTinChi());
            tongTinChi += mh.getSoTinChi();
        }
        return tongDiem/tongTinChi;
    }

    @Override
    public String toString() {
        return "[ Ma sv: "+maSv+" Ten sv: "+tenSV+" Ds Mon hoc: "+dsMonHoc.toString()+
        String.format("Diem tich luy: %.2f", tinhDiemTichLuy())+" Hoc phi: "+tinhHocPhiSV()+" ]";
    }
}
