package Clinica.model.repositorios;

import Clinica.model.classes.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaRepo extends JpaRepository<Cita, Integer> {

    List<Cita> findAllByPacienteCodigo(int codigoPaciente);
}



