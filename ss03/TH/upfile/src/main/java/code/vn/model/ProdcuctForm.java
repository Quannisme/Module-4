package code.vn.model;

import org.springframework.web.multipart.MultipartFile;

public class ProdcuctForm {
    private int id;
    private String name;
    private String decription;
    private MultipartFile image;

    public ProdcuctForm() {
    }

    public ProdcuctForm(int id, String name, String decription, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.decription = decription;
        this.image = image;
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

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
