package com.example.jotserver;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<Note, Long> {
    List<Note> getNotes();

    Note findNote(long id);
}
