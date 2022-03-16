package Case_study.models;

import java.util.Objects;

public abstract class Facility {
    private String maDichvu = "";
    private String tenDichvu = "";
    private double dienTichSuDung = 0;
    private double chiPhiThue = 0;
    private int soNguoiToiDa = 0;
    private String kieuThue = "";

    public Facility() {
    }

    public Facility(String maDichvu, String tenDichvu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        this.maDichvu = maDichvu;
        this.tenDichvu = tenDichvu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getMaDichvu() {
        return maDichvu;
    }

    public void setMaDichvu(String maDichvu) {
        this.maDichvu = maDichvu;
    }

    public String getTenDichvu() {
        return tenDichvu;
    }

    public void setTenDichvu(String tenDichvu) {
        this.tenDichvu = tenDichvu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "maDichvu='" + maDichvu + '\'' +
                ", tenDichvu='" + tenDichvu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soNguoiToiDa=" + soNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.dienTichSuDung, dienTichSuDung) == 0 &&
                Double.compare(facility.chiPhiThue, chiPhiThue) == 0 &&
                soNguoiToiDa == facility.soNguoiToiDa &&
                maDichvu.equals(facility.maDichvu) &&
                tenDichvu.equals(facility.tenDichvu) &&
                kieuThue.equals(facility.kieuThue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDichvu, tenDichvu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
    }
}
