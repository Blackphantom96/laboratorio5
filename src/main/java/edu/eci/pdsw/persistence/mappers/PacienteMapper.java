package edu.eci.pdsw.persistence.mappers;

import edu.eci.pdsw.samples.entities.Consulta;
import edu.eci.pdsw.samples.entities.Paciente;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2106913
 */
public interface PacienteMapper {

    public Paciente getPaciente(@Param("idp") int id, @Param("tipoidp") String tipoid);

    public List<Paciente> loadPacientes();

    public void insertarPaciente(Paciente p);

    public void insertConsulta(@Param("con")Consulta con, @Param("idp")int idPaciente,@Param("tipoidp") String tipoid, @Param("costo")int costoconsulta);

    public void actualizarPaciente(@Param("p")Paciente p);
    
}
