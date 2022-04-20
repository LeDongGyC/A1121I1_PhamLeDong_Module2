package Case_study.models;

public class House extends Facility {
    private String tieuChuanPhong = "";
    private int soTang = 0;

    public House(){};

    public House(String maDichvu, String tenDichvu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichvu, tenDichvu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                "tiêu chuẩn phòng: " + tieuChuanPhong +
                ", số tầng: " + soTang
                ;
    }
}
