package ejCafeteria;

public class Lanzador extends Thread {

	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria();
		// ...
		for (int i = 1; i <= 100; i++) {
			Alumno a = new Alumno(cafeteria);
			Thread hiloAlumno = new Thread(a);
			hiloAlumno.start();
		}

		for (int i = 1; i <= 100; i++) {
			Profesor p = new Profesor(cafeteria);
			Thread hiloProfesor = new Thread(p);
			hiloProfesor.start();
		}

	}

}
