package Case_study.models;

public class Room extends Facility {
    private String dichVuMienPhi = "";

    public Room() {
    }

    public Room(String maDichvu, String tenDichvu, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuMienPhi) {
        super(maDichvu, tenDichvu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room: " + super.toString() +
                "dịch vụ miễn phí đi kèm: " + dichVuMienPhi
                ;
    }
}
