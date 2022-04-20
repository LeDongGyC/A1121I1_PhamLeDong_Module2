package Final1.model;

public class DienThoaiChinhHang extends DienThoai {
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(String thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang(int id, String tenDT, double giaBan, int soLuong, String nhaSX, String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDT, giaBan, soLuong, nhaSX);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang: " + super.toString() +
                "thoiGianBaoHanh: " + thoiGianBaoHanh +
                ", phamViBaoHanh: " + phamViBaoHanh;
    }

    public String toCSV1(){
        return super.toCSV() + "," + this.thoiGianBaoHanh + "," + this.phamViBaoHanh;
    }
}
