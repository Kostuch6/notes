package com.clebre.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class NotesService {

    private final NotesRepository notesRepository;

    @Autowired
    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    Note getNote(String id) {
        return notesRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    List<Note> getAllNotes() {
        return notesRepository.findAll();
    }

    void saveNote(Note note) {
        notesRepository.save(note);
    }

    void deleteNote(String id) {
        notesRepository.deleteById(id);
    }
}
