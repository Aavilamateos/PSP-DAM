package ejercicioBlocYCalc;

public class ConstructorProcesos {
	public void ejecutarCalc() {
		ProcessBuilder pb;
		try {
			pb=new ProcessBuilder("calc");
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ejecutarNotepad() {
		ProcessBuilder pb;
		try {
			pb=new ProcessBuilder("notepad");
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
