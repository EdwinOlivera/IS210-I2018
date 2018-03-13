package clases;

public class Alumno extends Persona{
	private String cuenta;
	private float promedio;
		
	public Alumno(String cuenta, float promedio) {
		this.cuenta = cuenta;
		this.promedio = promedio;
	}

	public Alumno() {}
	
	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public float getPromedio() {
		return promedio;
	}


	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public String mostrarInformacion(){
		return nombre+" \t"+apellido;
	}
	
	public void matricular() {}
	
	public void cancelarAsignatura() {}
	
}
