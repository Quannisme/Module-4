package com.example.blog_ajax.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Blog2 {
    @Id
    @Column(columnDefinition = "varchar(50)")
    private String idBlog;
    private String nameBlog;
    private String titleBlog;
    private String contentBlog;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePublish;
    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;

    public Blog2() {
    }

    public Blog2(String idBlog, String nameBlog, String titleBlog, String contentBlog, LocalDate datePublish, Category category) {
        this.idBlog = idBlog;
        this.nameBlog = nameBlog;
        this.titleBlog = titleBlog;
        this.contentBlog = contentBlog;
        this.datePublish = datePublish;
        this.category = category;
    }

    public LocalDate getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(LocalDate datePublish) {
        this.datePublish = datePublish;
    }

    public String getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(String idBlog) {
        this.idBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getTitleBlog() {
        return titleBlog;
    }

    public void setTitleBlog(String titleBlog) {
        this.titleBlog = titleBlog;
    }

    public String getContentBlog() {
        return contentBlog;
    }

    public void setContentBlog(String contentBlog) {
        this.contentBlog = contentBlog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category idCategory) {
        this.category = idCategory;
    }
}
