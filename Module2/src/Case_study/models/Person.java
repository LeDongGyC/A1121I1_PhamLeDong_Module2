package Case_study.models;

public abstract class Person {
    private String maNV = "";
    private String hoTen = "";
    private String ngaySinh = "";
    private String gioiTinh = "";
    private String soCMND = "";
    private String email = "";

    public Person(){}

    public Person(String maNV, String hoTen, String ngaySinh, String gioiTinh, String soCMND, String email) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.email = email;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person:" +
                "maNV='" + maNV + ',' +
                ", hoTen='" + hoTen + ',' +
                ", ngaySinh='" + ngaySinh + ',' +
                ", gioiTinh='" + gioiTinh + ',' +
                ", soCMND='" + soCMND + ',' +
                ", email='" + email + ','
                ;
    }
}
