public class Account{
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien;

    public Account() {
        super();
    }
    public Account(long soTaiKhoan, String tenTaiKhoan, double soTien) {
        super();
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = soTien;
    }
    public Account(long soTaiKhoan, String tenTaiKhoan) {
        super();
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = 50;
    }
    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }
    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    @Override
    public String toString() {
        return "Account [soTaiKhoan = " + soTaiKhoan + ", tenTaiKhoan = " + tenTaiKhoan + ", soTien = " + soTien + "]";
    }
    public void napTien(double soTienNap) {
        soTien = soTien + soTienNap;
        System.out.println("Nạp thành công, số tiền trong tài khoản là: "+soTien);
    }
    public void rutTien(double soTienRut) {
        if(soTienRut > soTien) {
            System.out.println("Số tiền rút phải nhiều hơn số tiền trong tài khoản");
        }
        else
        {
            soTien = soTien - soTienRut - 3000;
            System.out.println("Số tiền còn lại là: " +soTien+ ", Phí rút 3000 đồng");
        }
    }
    public void chuyenTien(Account B, double soTienChuyen) {
        if(B == null) {
            System.out.println("Tài khoản "+B.tenTaiKhoan+" không tồn tại");
        }
        else if(soTienChuyen > soTien) {
            System.out.println("Số tiền trong tài khoản không đủ");
        }
        else
        {
            soTien = soTien - soTienChuyen;
            B.soTien = B.soTien + soTienChuyen;
            System.out.println("Chuyển tiền thành công");
        }
    }

}
