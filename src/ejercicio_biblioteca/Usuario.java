package ejercicio_biblioteca;

public class Usuario {
	
	static int cont=0;
	String documento;
	String nombre;
	String codUser;
	
	public Usuario(String documento, String nombre) {
		codUser = "U" +cont++;
		this.documento = documento;
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
