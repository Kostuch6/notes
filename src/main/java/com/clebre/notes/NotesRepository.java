package com.clebre.notes;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface NotesRepository extends CassandraRepository<Note, String> {

}
