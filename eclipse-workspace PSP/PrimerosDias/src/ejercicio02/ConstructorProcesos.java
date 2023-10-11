package ejercicio02;

import java.io.IOException;

public class ConstructorProcesos {
	public void ejecutarCalc() {
		try {
			ProcessBuilder p=new ProcessBuilder("calc");
			p.start();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	public void ejecutarBloc() {
		try {
			ProcessBuilder p=new ProcessBuilder("notepad");
			p.start();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
