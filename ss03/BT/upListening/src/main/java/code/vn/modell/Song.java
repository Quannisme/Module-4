package code.vn.modell;

import java.util.List;

public class Song {
    private String name;
    private String author;
    private List<String> type;
    private String link;

    public Song() {
    }

    public Song(String name, String author, List<String> type, String link) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
