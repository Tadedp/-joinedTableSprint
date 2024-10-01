package org.example.joinedTableSpring.repositorios;

import org.example.joinedTableSpring.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository <Profesor,Long >{
}
