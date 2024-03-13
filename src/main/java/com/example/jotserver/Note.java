package com.example.jotserver;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;

@Table(name = "note")
@Entity
@Getter
@ToString
public class Note {
    @Id
    private Long id;
    private String title;
    private String content;

    protected Note() {
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
