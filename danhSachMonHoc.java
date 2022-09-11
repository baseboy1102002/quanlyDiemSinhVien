import java.util.Scanner;

public class danhSachMonHoc {
    private monHoc[] dsmonhoc;

    Scanner sc = new Scanner(System.in);
    
    // --- constructor, set-get --- //
    public danhSachMonHoc() {}
    public void setDsmonhoc(monHoc[] dsmonhoc) {
        this.dsmonhoc = dsmonhoc;
    }
    public monHoc[] getDsmonhoc() {
        return dsmonhoc;
    }

    // --- methods ---- //
    public void nhapdsmh() {
        System.out.println("Nhap so mon hoc:");
        dsmonhoc = new monHoc[Integer.parseInt(sc.nextLine())];
        for (int i = 0; i < dsmonhoc.length; i++) {
            System.out.println("Nhap loai mon: 1.Ly Thuyet\t2.Thuc Hanh\t3.Do An");
            int choice = -1;
            while (choice < 1 || choice > 3) {
                System.out.println("Vui long chon dung:");
                choice = Integer.parseInt(sc.nextLine());
            }
            switch (choice) {
                case 1:
                    dsmonhoc[i] = new monLyThuyet();
                    dsmonhoc[i].nhapMon(); break;
                case 2:
                    dsmonhoc[i] = new monThucHanh(); 
                    dsmonhoc[i].nhapMon(); break;
                case 3:
                    dsmonhoc[i] = new monDoAn(); 
                    dsmonhoc[i].nhapMon(); break;
            }
        }
    }

    @Override
    public String toString() {
        String ds = "";
        for (int i = 0; i < dsmonhoc.length; i++) {
            ds += dsmonhoc[i].getTenMonHoc() + ", ";
        }
        return ds;
    }
}
