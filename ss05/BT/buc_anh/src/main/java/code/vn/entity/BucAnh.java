package code.vn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BucAnh")
public class BucAnh {
    @Id
    @Column(name = "bucAnh_id", columnDefinition = "varchar(20)")
    private String id;
    private String view;
    private String author;
    private String feedback;

    public BucAnh() {
    }

    public BucAnh(String id, String view, String author, String feedback) {
        this.id = id;
        this.view = view;
        this.author = author;
        this.feedback = feedback;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
