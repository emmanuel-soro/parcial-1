package soroLaurenti;

public class Coincidencia {

	private String respuestas;
	private int cantidadColaboradoresCoicidentes;
	
	public Coincidencia(String respuestas, int cantidadColaboradoresCoicidentes) {
		this.respuestas = respuestas;
		this.cantidadColaboradoresCoicidentes = cantidadColaboradoresCoicidentes;
	}

	public String getRespuestas() {
		return respuestas;
	}

	public int getCantidadColaboradoresCoicidentes() {
		return cantidadColaboradoresCoicidentes;
	}

	public void setCantidadColaboradoresCoicidentes(int cantidadColaboradoresCoicidentes) {
		this.cantidadColaboradoresCoicidentes = cantidadColaboradoresCoicidentes;
	}

	
}
