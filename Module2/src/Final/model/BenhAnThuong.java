package Final.model;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(int stt, String maBenhAn, String tenBenhNhan, String ngayVaoVien, String ngayRaVien, String liDoNhapVien, double phiNamVien) {
        super(stt, maBenhAn, tenBenhNhan, ngayVaoVien, ngayRaVien, liDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong: " + super.toString() +
                ",phiNamVien=" + phiNamVien;
    }

    public String thuongToCSV() {
        return super.toCSV() + "," + this.phiNamVien;
    }
}
