package Final1.model;


public class DienThoai {
    private int id = 0;
    private String tenDT;
    private double giaBan;
    private int soLuong;
    private String nhaSX;
    final private String COMA = ",";

    public DienThoai() {
    }

    public DienThoai(int id, String tenDT, double giaBan, int soLuong, String nhaSX) {
        this.id = id;
        this.tenDT = tenDT;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSX = nhaSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", tenDT: " + tenDT +
                ", giaBan: " + giaBan +
                ", soLuong: " + soLuong +
                ", nhaSX: " + nhaSX;
    }

    public String toCSV() {
        return this.id + COMA + this.tenDT + COMA + this.giaBan + COMA + this.soLuong + COMA + this.nhaSX;
    }
}
