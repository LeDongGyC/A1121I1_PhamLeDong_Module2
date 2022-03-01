package ss5_access_modifier.bai_tap.xay_dung_lop_chi_ghi;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Name and Classes: " + student1.toString());
        Student student2 = new Student();
        student2.setName("LD");
        student2.setClasses("L023R");
        System.out.println("Name and Classes: " + student2.toString());
    }
}
