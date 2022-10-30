package com.anmv.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class ArticleGenerator {
    @Id
    @Column(name = "id")
    @GenericGenerator(
            name = "article-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "article_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "10"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "3")
            }
    )
    @GeneratedValue(generator = "article-sequence-generator")
    private int id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "`status`", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    public ArticleGenerator() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ArticleGenerator{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                '}';
    }
}
