package estaticos;
public class Coche {
    // Atributo estático para contar el número total de coches creados
    private static int totalCochesCreados = 0;

    // Atributos no estáticos
    private String marca;
    private int kilometraje;

    // Constructor
    public Coche(String marca) {
        this.marca = marca;
        this.kilometraje = 0;
        totalCochesCreados++;  // Incrementa el contador total cada vez que se crea un coche
    }

    // Método para aumentar el kilometraje
    public void conducir(int km) {
        if (km > 0) {
            kilometraje += km;
        }
    }

    // Método para obtener el kilometraje del coche
    public int getKilometraje() {
        return kilometraje;
    }

    // Método estático para obtener el total de coches creados
    public static int getTotalCochesCreados() {
        return totalCochesCreados;
    }
}
