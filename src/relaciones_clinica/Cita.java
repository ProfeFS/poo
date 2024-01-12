package relaciones_clinica;
import java.util.Date;

public class Cita {
    private Paciente paciente;
    private String doctorNombre;
    private Date fechaHora;
    private String motivo;

    public Cita(Paciente paciente, String doctorNombre, Date fechaHora, String motivo) {
        this.paciente = paciente;
        this.doctorNombre = doctorNombre;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
    }

	public Paciente getPaciente() {
		return paciente;
	}

	public String getDoctorNombre() {
		return doctorNombre;
	}


	
	


    
}
