package enums;

enum ColorOjo {
	azul("AZUL", 1), rojo("MARRÓN", 2), verde("VERDE", 3);

	private int codigo;
	private String color;

	// Constructor privado por definición
	ColorOjo(String nombre, int val) {
		this.color = nombre.toLowerCase();
		codigo = val;
	}

	@Override
	public String toString() {
		return color;
	}
	
	public int getCode() {
		return codigo;
	}
	
	public void setCode(int code) {
		codigo = code;
	}
}