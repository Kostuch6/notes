package com.clebre.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NotesController {

    private final NotesService notesService;

    @Autowired
    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @GetMapping("/{id}")
    Note getNote(@PathVariable String id) {
        return notesService.getNote(id);
    }

    @GetMapping
    List<Note> getAllNotes() {
        return notesService.getAllNotes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void saveNote(@RequestBody Note note) {
        notesService.saveNote(note);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteNote(@PathVariable String id) {
        notesService.deleteNote(id);
    }

}
