package Case_study.models;

public class Customer extends Person {
    private String maKH;
    private String loaiKH;
    private String diaChi;
    final String SEPARATION = ",";

    public Customer(String maKH, String loaiKH, String diaChi) {
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public Customer() {
    }


    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String email, String soDT, String maKH, String loaiKH, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() +
                ", mã khách hàng: " + maKH +
                ", loại khách hàng: " + loaiKH +
                ", địa chỉ: " + diaChi;
    }

    public String toCustomerCSV(){
        return this.maKH + SEPARATION + this.loaiKH + SEPARATION + this.diaChi + SEPARATION + super.toCSV();
    }
}
