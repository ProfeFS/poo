package herencia.abstractas;

public abstract class FiguraGeometrica {
	private String tipo;

    public FiguraGeometrica(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de figura: " + tipo);
    }
    
    public String getTipo() {
    	return tipo;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método abstracto para calcular el perímetro
    public abstract double calcularPerimetro();

}
