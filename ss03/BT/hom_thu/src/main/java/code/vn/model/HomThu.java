package code.vn.model;

import java.util.List;

public class HomThu {
    String id;
    List<String> language;
    List<String> pageSize;
    List<String> spamsFilter;
    String signature;
    public HomThu() {
    }

    public HomThu(String id, String signature) {
        this.id = id;
        this.signature = signature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public List<String> getPageSize() {
        return pageSize;
    }

    public void setPageSize(List<String> pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(List<String> spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
