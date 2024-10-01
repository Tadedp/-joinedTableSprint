package org.example.joinedTableSpring.repositorios;

import org.example.joinedTableSpring.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
