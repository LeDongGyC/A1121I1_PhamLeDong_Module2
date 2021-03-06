package Case_study.models;

public class Villa extends Facility {
    private String tieuChuanPhong = "";
    private double dienTichHoBoi = 0;
    private int soTang = 0;
    final String SEPARATION = ",";
    public Villa() {
    }

    public Villa(String maDichvu, String tenDichvu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(maDichvu, tenDichvu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                "tiêu chuẩn phòng: " + tieuChuanPhong +
                ", diện tích hồ bơi: " + dienTichHoBoi +
                ", số tầng: " + soTang
                ;
    }

    public String toVillaCSV(){
        return super.toCSV() + SEPARATION + this.tieuChuanPhong + SEPARATION + this.dienTichHoBoi + SEPARATION + this.soTang;
    }
}
