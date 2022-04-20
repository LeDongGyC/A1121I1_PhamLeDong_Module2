package Final.model;

public class BenhAn {
    private int stt = 0;
    private String maBenhAn;
    private String tenBenhNhan;
    private String ngayVaoVien;
    private String ngayRaVien;
    private String liDoNhapVien;
    final String COMA = ",";

    public BenhAn() {
        stt++;
    }

    public BenhAn(int stt, String maBenhAn, String tenBenhNhan, String ngayVaoVien, String ngayRaVien, String liDoNhapVien) {
        this.stt = stt;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayVaoVien = ngayVaoVien;
        this.ngayRaVien = ngayRaVien;
        this.liDoNhapVien = liDoNhapVien;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayVaoVien() {
        return ngayVaoVien;
    }

    public void setNgayVaoVien(String ngayVaoVien) {
        this.ngayVaoVien = ngayVaoVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLiDoNhapVien() {
        return liDoNhapVien;
    }

    public void setLiDoNhapVien(String liDoNhapVien) {
        this.liDoNhapVien = liDoNhapVien;
    }

    @Override
    public String toString() {
        return
                "stt:" + stt +
                ",maBenhAn='" + maBenhAn +
                ",tenBenhNhan='" + tenBenhNhan +
                ",ngayVaoVien='" + ngayVaoVien +
                ",ngayRaVien='" + ngayRaVien +
                ",liDoNhapVien='" + liDoNhapVien;
    }

    public String toCSV() {
        return this.stt + COMA + this.maBenhAn + COMA + this.tenBenhNhan + COMA + this.ngayVaoVien + COMA + this.ngayRaVien + COMA + this.liDoNhapVien;
    }
}
