package estaticos;

public class UsoFechas {

	public static void main(String[] args) {

		Fecha fecha = new Fecha(5,7,1985);
		fecha.mostrar();
		
		System.out.println(Fecha.bisiesto(2024));
		System.out.println(fecha.checkBisiesto());
		
		

	}

}
