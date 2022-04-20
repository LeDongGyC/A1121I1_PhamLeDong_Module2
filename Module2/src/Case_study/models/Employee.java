package Case_study.models;

public class Employee extends Person {
    private String maNV;
    private String trinhDo;
    private String viTri;
    private double luong;
    final String SEPARATION = ",";

    public Employee() {
    }

    public Employee(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email, String maNV, String trinhDo, String viTri, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.maNV = maNV;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }



    @Override
    public String toString() {
        return "Employee:" + super.toString() +
                ",mã nhân viên: " + maNV +
                ",trình độ: " + trinhDo +
                ",vị trí: " + viTri +
                ",lương: " + luong;
    }

    public String toEmployCSV() {
        return this.maNV + SEPARATION + super.toCSV() + SEPARATION + this.trinhDo + SEPARATION + this.viTri + SEPARATION +this.luong;
    }
}
