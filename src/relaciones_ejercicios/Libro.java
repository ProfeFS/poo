package relaciones_ejercicios;
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    
    //boolean estaPrestado = false;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + "]";
	}



    // Puedes agregar aquí más métodos si son necesarios
}
