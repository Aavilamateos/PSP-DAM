package buzón;

public class Escritor implements Runnable{
	private Buzón buz;
	public Escritor(Buzón buz) {
		this.buz=buz;
	}
	public void modificarMensaje() {
		if (buz.getHayMensaje()==false) {
			buz.setMensaje("Hola");
			buz.setHayMensaje(true);	
		}
	}
	@Override
	public void run() {
		System.out.println("Escritor: empezando");
		modificarMensaje();
	}

}
