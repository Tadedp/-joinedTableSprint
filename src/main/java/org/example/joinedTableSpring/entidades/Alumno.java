package org.example.joinedTableSpring.entidades;

import org.example.joinedTableSpring.enumeraciones.Especialidades;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
public class Alumno extends Persona{
    private int legajo;
    private Especialidades especialidad;
}
