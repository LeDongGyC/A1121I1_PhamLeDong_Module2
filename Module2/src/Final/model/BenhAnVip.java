package Final.model;

public class BenhAnVip extends BenhAn {
    private String loaiVIP;

    public BenhAnVip(){}

    public BenhAnVip(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public BenhAnVip(int stt, String maBenhAn, String tenBenhNhan, String ngayVaoVien, String ngayRaVien, String liDoNhapVien, String loaiVIP) {
        super(stt, maBenhAn, tenBenhNhan, ngayVaoVien, ngayRaVien, liDoNhapVien);
        this.loaiVIP = loaiVIP;
    }

    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    @Override
    public String toString() {
        return "BenhAnVip: " + super.toString() +
                "loaiVIP: " + loaiVIP;
    }

    public String VipToCSV(){
        return super.toCSV() + "," + this.loaiVIP;
    }
}
