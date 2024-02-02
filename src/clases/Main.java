package clases;

public class Main {

	public static void main(String[] args) {
		
//		
//		RecetaCocina arrozConPollo = new RecetaCocina("Arroz con pollo", "Arroz");		
//		System.out.println(arrozConPollo.mostrarReceta());
		
//		JuegoMovil tetris = new JuegoMovil("Tetris", "2.0");		
//		tetris.iniciarJuego();
//		System.out.println(tetris.mostrarEstado());
//		tetris.finalizarJuego();
//		System.out.println(tetris.mostrarEstado());
		
//		CuentaEstudianteArrayList nuevaCuenta = new CuentaEstudianteArrayList("Andrés", "1234");
//		System.out.println(nuevaCuenta.mostrarInformacion());
//		nuevaCuenta.matricularAsignatura("Mates");
//		nuevaCuenta.ajustarSaldoCreditos(5);
//		System.out.println("\r" +nuevaCuenta.mostrarInformacion());
		
		Reloj reloj = new Reloj();
		System.out.println(reloj.mostrarHora());
		reloj.establecerHora(19, 30, 0);
		System.out.println(reloj.mostrarHora());
		

	}

}
