package f1;

public class Lanzador {
	public static void main(String[] args) {
		Carrera carrera = new Carrera(1000);
		Coche cocheAlonso = new Coche("Alonso", 100, carrera);
		Coche cocheHamilton=new Coche("Hamilton", 101, carrera);
		Coche cochePabs=new Coche("Pabs", 99, carrera);
		Thread hiloCocheA=new Thread(cocheAlonso);
		Thread hiloCocheH=new Thread(cocheHamilton);
		Thread hiloCocheP=new Thread(cochePabs);
		hiloCocheA.start();
		hiloCocheH.start();
		hiloCocheP.start();
		try {
			hiloCocheA.join();
			hiloCocheH.join();
			hiloCocheP.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		carrera.imprimirPodio();
	}
}