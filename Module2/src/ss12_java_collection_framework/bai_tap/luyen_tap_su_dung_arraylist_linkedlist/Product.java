package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

public class Product {
    private String name = "";
    private String id = "";
    private int price = 0;

    public Product(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
