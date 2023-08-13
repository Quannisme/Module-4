package code.vn.model;

public class Product {
    private int id;
    private String name;
    private String decription;
    private String image;

    public Product(int id, String name, String decription, String image) {
        this.id = id;
        this.name = name;
        this.decription = decription;
        this.image = image;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
