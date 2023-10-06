package Clinica.services.impl;

import Clinica.model.enums.EstadoPQRS;
import Clinica.repositorios.*;
import Clinica.services.interfaces.AdmnistradorServicio;
import Clinica.dto.administrador.*;
import Clinica.dto.ItemPQRSDTO;
import Clinica.dto.RegistroRespuestaDTO;
import Clinica.repositorios.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdministradorSerivicioImpl implements AdmnistradorServicio {


    private final MedicoRepo medicoRepo;
    private final PQRSRepo pqrsRepo;
    private final CitaRepo citaRepo;
    private final MensajeRepo mensajeRepo;
    private final CuentaRepo cuentaRepo;
    private final HorarioRepo horarioRepo;


    @Override
    public int crearMedico(RegistroMedicoDTO medico) throws Exception {
        return 0;
    }

    @Override
    public int actualizarMedico(DetallesMedicoDTO medico) throws Exception {
        return 0;
    }

    @Override
    public void eliminarMedico(int codigo) throws Exception {

    }

    @Override
    public List<ItemMedicoDTO> listarMedicos() throws Exception {
        return null;
    }

    @Override
    public DetallesMedicoDTO obtenerMedico(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<ItemPQRSDTO> listarPQRS() throws Exception {
        return null;
    }

    @Override
    public DetallesPQRSDTO verDetallePQRS(int codigo) throws Exception {
        return null;
    }

    @Override
    public int responderPQRS(RegistroRespuestaDTO registroRespuestaDTO) throws Exception {
        return 0;
    }

    @Override
    public List<ItemCitaDTO> listarCitas() throws Exception {
        return null;
    }

    @Override
    public void cambiarEstadoPQRS(int codigoPQRS, EstadoPQRS estadoPQRS) throws Exception {

    }
}
