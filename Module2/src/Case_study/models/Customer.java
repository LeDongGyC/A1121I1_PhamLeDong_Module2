package Case_study.models;

public class Customer extends Person{
    private String maKH = "";
    private String loaiKH = "";
    private String address = "";

    public Customer(){
    }

    public Customer(String maKH, String loaiKH, String address) {
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.address = address;
    }

    public Customer(String maNV, String hoTen, String ngaySinh, String gioiTinh, String soCMND, String email, String maKH, String loaiKH, String address) {
        super(maNV, hoTen, ngaySinh, gioiTinh, soCMND, email);
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.address = address;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() +
                "maKH='" + maKH  +
                ", loaiKH='" + loaiKH +
                ", address='" + address ;
    }
}
