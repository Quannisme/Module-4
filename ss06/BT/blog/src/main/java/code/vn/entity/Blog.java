package code.vn.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String id;
    private String name;
    private String title;
    private String content;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date datePush;

    private String datePush;

    public Blog(String id, String name, String title, String content, String datePush) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
        this.datePush = datePush;
    }

    public Blog() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatePush() {
        return datePush;
    }

    public void setDatePush(String datePush) {
        this.datePush = datePush;
    }
}
