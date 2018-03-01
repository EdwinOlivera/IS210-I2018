package clases;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
		
	/*public Fecha(String dia, String mes, String anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public Fecha() {}*/
	
	public Fecha(String fecha) { //DD-MM-YYYY
		String partes[] = fecha.split("-");
		this.dia = Integer.parseInt(partes[0]);
		this.mes = Integer.parseInt(partes[1]);
		this.anio = Integer.parseInt(partes[2]);
	}
	
	public boolean verificarFecha() {
		if (this.dia <0 || this.dia>31)
			return false;
		
		if (this.mes <1 || this.mes >12)
			return false;
		
		if (this.anio <1 || this.anio >9999)
			return false;
		
		return true;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

	
	
}
