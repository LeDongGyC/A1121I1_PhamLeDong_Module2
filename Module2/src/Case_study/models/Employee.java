package Case_study.models;

public class Employee extends Person{
    private String trinhDo = "";
    private String viTri = "";
    private float salary = 0.0f;

    public Employee() {
    }

    public Employee(String trinhDo, String viTri, float salary) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.salary = salary;
    }

    public Employee(String maNV, String hoTen, String ngaySinh, String gioiTinh, String soCMND, String email, String trinhDo, String viTri, float salary) {
        super(maNV, hoTen, ngaySinh, gioiTinh, soCMND, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.salary = salary;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() +
                "trinhDo='" + trinhDo +
                ", viTri='" + viTri  +
                ", salary=" + salary ;
    }
}
