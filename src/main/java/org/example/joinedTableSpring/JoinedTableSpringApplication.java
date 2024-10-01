package org.example.joinedTableSpring;

import org.example.joinedTableSpring.repositorios.AlumnoRepository;
import org.example.joinedTableSpring.repositorios.PersonaRepository;
import org.example.joinedTableSpring.repositorios.ProfesorRepository;
import org.example.joinedTableSpring.entidades.Profesor;
import org.example.joinedTableSpring.entidades.Alumno;
import org.example.joinedTableSpring.enumeraciones.Especialidades;
import org.example.joinedTableSpring.enumeraciones.Titulos;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class JoinedTableSpringApplication {
	private static final Logger logger = LoggerFactory.getLogger(org.example.joinedTableSpring.JoinedTableSpringApplication.class);

	@Autowired
	private org.example.joinedTableSpring.repositorios.PersonaRepository personaRepository;
	@Autowired
	private org.example.joinedTableSpring.repositorios.ProfesorRepository profesorRepository;
	@Autowired
	private org.example.joinedTableSpring.repositorios.AlumnoRepository alumnoRepository;

	public static void main(String[] args) {
		SpringApplication.run(org.example.joinedTableSpring.JoinedTableSpringApplication.class, args);

		System.out.println("funcionando");
	}

	@Bean
	@Transactional
	CommandLineRunner init(org.example.joinedTableSpring.repositorios.PersonaRepository personaRepository,
						   org.example.joinedTableSpring.repositorios.AlumnoRepository alumnoRepository,
						   org.example.joinedTableSpring.repositorios.ProfesorRepository profesorRepository) {
		return args -> {

			LocalDate fechaIngreso = LocalDate.of(2021, 5, 10);
			BigDecimal sueldo = new BigDecimal("100.05");

			org.example.joinedTableSpring.entidades.Profesor pro1 = org.example.joinedTableSpring.entidades.Profesor.builder()
					.nombre("Sofia")
					.apellido("Sánchez")
					.cantHijos(1)
					.fechaIngreso(fechaIngreso)
					.sueldo(sueldo)
					.titulo(Titulos.LICENCIADO)
					.build();

			profesorRepository.save(pro1);

			fechaIngreso = LocalDate.of(2021, 2, 16);
			sueldo = new BigDecimal("111.11");

			org.example.joinedTableSpring.entidades.Profesor pro2 = org.example.joinedTableSpring.entidades.Profesor.builder()
					.nombre("Gabriel")
					.apellido("Ponce")
					.cantHijos(4)
					.fechaIngreso(fechaIngreso)
					.sueldo(sueldo)
					.titulo(Titulos.INGENIERO)
					.build();

			profesorRepository.save(pro2);

			org.example.joinedTableSpring.entidades.Alumno al1 = org.example.joinedTableSpring.entidades.Alumno.builder()
					.nombre("Vicente")
					.apellido("Cara")
					.legajo(62211)
					.especialidad(Especialidades.BACHILLER)
					.build();

			alumnoRepository.save(al1);

			org.example.joinedTableSpring.entidades.Alumno al2 = org.example.joinedTableSpring.entidades.Alumno.builder()
					.nombre("Celina")
					.apellido("Guerra")
					.legajo(62058)
					.especialidad(Especialidades.BACHILLER)
					.build();

			alumnoRepository.save(al2);

			org.example.joinedTableSpring.entidades.Alumno al3 = org.example.joinedTableSpring.entidades.Alumno.builder()
					.nombre("Valentina")
					.apellido("Artola")
					.legajo(62179)
					.especialidad(Especialidades.PERITO_MERCANTIL)
					.build();

			alumnoRepository.save(al3);
		};
	};
}
