package ejercicio_restauranteV2;

public class Mesa {
	private int codMesa;
	private int numMaximo;
	
	public Mesa(int codMesa, int numMaximo) {
		this.codMesa = codMesa;
		this.numMaximo = numMaximo;

	}
	
	

	public int getCodMesa() {
		return codMesa;
	}

	public int getNumMaximo() {
		return numMaximo;
	}

	public void setNumMaximo(int numMaximo) {
		this.numMaximo = numMaximo;
	}

	
	

}
