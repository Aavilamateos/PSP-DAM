package ejercicio01;


public class Prueba_Process_builder {
	
	public static void main(String[] args) {
		String ruta="C:\\WINDOWS\\system32\\notepad.exe";
		ConstructorProcesos cP=new ConstructorProcesos();
		cP.ejecutar(ruta);
		System.out.println("Finalizado");
		
	}
}
