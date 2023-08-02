package in.stackroute.ust.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Blog extends Publication {

    private String author;
    private String url;

    public Blog() {
    }

    public Blog(String author, String url) {
        this.author = author;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
