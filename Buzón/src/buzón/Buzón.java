package buzón;

public class Buzón {
	private Boolean hayMensaje;
	private String mensaje;
	
	public Buzón() {
		hayMensaje=false;
		mensaje="";

	}
	public synchronized Boolean getHayMensaje() {
		return hayMensaje;
	}
	public synchronized void setHayMensaje(Boolean hayMensaje) {
		this.hayMensaje = hayMensaje;
	}
	public synchronized String getMensaje() {
		return mensaje;
	}
	public synchronized void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
