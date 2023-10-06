package Clinica.dto.paciente;

import Clinica.model.enums.Ciudad;
import Clinica.model.enums.EPS;
import Clinica.model.enums.TipoSangre;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DetallePacienteDTO(
        @NotNull
        String cedula,
        @NotNull @Email
        String email,
        @NotNull
        String nombre,
        @NotNull
        int telefono,
        @NotNull
        Ciudad ciudad,
        @NotNull
        Date fechaNacimiento,
        @NotNull
        String alergias,
        @NotNull
        EPS eps,
        @NotNull
        TipoSangre tipoSangre,
        @NotNull
        String urlFoto

) {
}
