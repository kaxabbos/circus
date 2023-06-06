package com.circus.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Sessions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String time;
    private String start;
    @Column(length = 5000)
    private String description;
    private String date;
    private String poster;
    private String[] screenshots;
    private int count;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Income income;
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Comments> comments;
    @ManyToOne(fetch = FetchType.LAZY)
    private Users owner;

    public Sessions(String name, String time, String start, String description, String date, String poster, String[] screenshots, int price, int count) {
        this.name = name;
        this.time = time;
        this.start = start;
        this.description = description;
        this.date = date;
        this.poster = poster;
        this.screenshots = screenshots;
        this.count = count;
        this.income = new Income(price);
    }

    public void addComment(Comments comment) {
        comments.add(comment);
        comment.setBook(this);
    }

    public void removeComment(Comments comment) {
        comments.remove(comment);
        comment.setBook(null);
    }
}
