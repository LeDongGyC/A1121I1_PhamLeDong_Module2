package Final1.model;

public class DienThoaiXachTay extends DienThoai{
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(String quocGiaXachTay, String trangThai) {
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public DienThoaiXachTay(int id, String tenDT, double giaBan, int soLuong, String nhaSX, String quocGiaXachTay, String trangThai) {
        super(id, tenDT, giaBan, soLuong, nhaSX);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay: " + super.toString() +
                "quocGiaXachTay: " + quocGiaXachTay +
                ", trangThai: " + trangThai;
    }

    public String toCSV2(){
        return super.toCSV() + "," + this.quocGiaXachTay + "," + this.trangThai;
    }
}
