package Case_study.models;

public abstract class Person {
    private String hoTen ;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String soDT;
    private String email;
    final String SEPARATION = ",";
    public Person(){}

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
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
        return "họ tên: " + hoTen +
                ",ngày sinh: " + ngaySinh +
                ",giới tính: " + gioiTinh +
                ",số CMND: " + soCMND +
                ",số ĐT: " + soDT +
                ",Email: " + email
                ;
    }

    public String toCSV(){
        return this.hoTen + SEPARATION + this.ngaySinh + SEPARATION + this.gioiTinh + SEPARATION + this.soCMND + SEPARATION + this.soDT + SEPARATION + this.email;
    }
}
