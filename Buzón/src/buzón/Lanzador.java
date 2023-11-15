package buzón;

public class Lanzador {
	public static void main(String[] args) {
		Buzón buz=new Buzón();
		Lector lector=new Lector(buz);
		Escritor escritor=new Escritor(buz);
		Thread hiloEsc=new Thread(escritor);
		Thread hiloLec=new Thread(lector);
		hiloEsc.start();
		hiloLec.start();
		
		try {
			hiloEsc.join();
			hiloLec.join();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
}
