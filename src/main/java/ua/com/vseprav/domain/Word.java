package ua.com.vseprav.domain;

import javax.persistence.*;

@Entity
public class Word {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String text;
    @ManyToOne
    private Dictionary dictionary;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
