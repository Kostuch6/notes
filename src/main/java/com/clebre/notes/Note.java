package com.clebre.notes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("note")
@Data
@NoArgsConstructor
@AllArgsConstructor
class Note {

    @Id
    String id;
    String value;

}
