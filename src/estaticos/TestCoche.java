package estaticos;
public class TestCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota");
        coche1.conducir(100);

        Coche coche2 = new Coche("Honda");

        System.out.println("Kilometraje del coche1: " + coche1.getKilometraje());  // Salida: 100
        System.out.println("Total de coches creados: " + Coche.getTotalCochesCreados());  // Salida: 2
    }
}
