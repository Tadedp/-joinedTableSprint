package org.example.joinedTableSpring.repositorios;

import org.example.joinedTableSpring.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno, Long> {
}
