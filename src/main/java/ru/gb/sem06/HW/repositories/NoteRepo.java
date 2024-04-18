package ru.gb.sem06.HW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.sem06.HW.model.Note;

public interface NoteRepo extends JpaRepository<Note, Long> {
}
