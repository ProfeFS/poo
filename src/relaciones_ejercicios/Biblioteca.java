package relaciones_ejercicios;
import java.util.Date;

public class Biblioteca {
    public static void main(String[] args) {
        // Creación de libros
        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-3-16-148410-0");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-1");

        // Creación de usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "JP1234");
        Usuario usuario2 = new Usuario("Ana López", "AL5678");

        // Creación de préstamos
        Prestamo prestamo1 = new Prestamo(libro1, usuario1, new Date()); 
        Prestamo prestamo2 = new Prestamo(libro2, usuario2, new Date()); 

        // Mostrar detalles de los préstamos
        prestamo1.mostrarDetallePrestamo();
        prestamo2.mostrarDetallePrestamo();
    }


}
