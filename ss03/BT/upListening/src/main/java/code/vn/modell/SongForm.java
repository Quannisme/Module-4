package code.vn.modell;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class SongForm {
    private String name;
    private String author;
    private List<String> type;
    private MultipartFile link;

    public SongForm() {
    }

    public SongForm(String name, String author, List<String> type, MultipartFile link) {
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

    public MultipartFile getLink() {
        return link;
    }

    public void setLink(MultipartFile link) {
        this.link = link;
    }
}
