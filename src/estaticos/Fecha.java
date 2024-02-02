package estaticos;

class Fecha {

	private int dia;

	private int mes;

	private int anio;

	private int diasOrigen;

	private static final int[] DIAS_MESES = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private static final char[] INICIALES_DIAS = new char[] { 's', 'd', 'l', 'm', 'x', 'j', 'v' };

	public Fecha() {
		this(1, 1, 1);
	}

	public Fecha(int dia, int mes, int anio) {
		this.set(dia, mes, anio);
	}

	public Fecha(Fecha fecha) {
		this(fecha.dia, fecha.mes, fecha.anio);
	}

	private void set(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public void set(Fecha fecha) {
		this.set(fecha.dia, fecha.mes, fecha.anio);
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public Fecha clone() {
		return new Fecha(dia, mes, anio);
	}

	public void mostrar() {
		System.out.println(toStringCAS());

	}

	public String toStringCAS() {
		return dia + "/" + mes + "/" + anio;
	}

	public boolean igual(Fecha fecha) {
		return dia == fecha.dia && mes == fecha.mes && anio == fecha.anio;
	}

	public boolean anterior(Fecha fecha) {
		return this.diasOrigen() < fecha.diasOrigen();
	}

	public boolean posterior(Fecha fecha) {
		return !this.igual(fecha) && !this.anterior(fecha);
	}

	public int diferencia(Fecha fecha) {
		return this.diasOrigen() - fecha.diasOrigen();
	}

	private int diasOrigen() {
		int resultado = this.diaAnio();
		resultado += 365 * (anio - 1);
		for (int i = 1; i < anio - 1; i++) {
			if (Fecha.bisiesto(i)) {
				resultado++;
			}
		}
		return resultado;
	}

	public static boolean bisiesto(int anio) {
		return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
	}

	public static int diasAnio(int anio) {
		int resultado = 365;
		if (Fecha.bisiesto(anio)) {
			resultado++;
		}
		return resultado;
	}

	public int diaAnio() {
		int resultado = dia;
		for (int i = 0; i < (mes - 1); i++) {
			resultado += DIAS_MESES[i];
		}
		if (mes > 2 && this.checkBisiesto()) {
			resultado++;
		}
		return resultado;
	}

	public boolean festivo() {
		final char DIA_SEMANA = this.diaSemana();
		return DIA_SEMANA == 's' || DIA_SEMANA == 'd';
	}

	public char diaSemana() {
		return INICIALES_DIAS[(this.diasOrigen() - 1) % 7];
	}

	public boolean checkBisiesto() {
		return Fecha.bisiesto(anio);
	}

}