package buzón;

public class Lector implements Runnable{
	private Buzón buz;
	
	public Lector(Buzón buz) {
		this.buz=buz;
	}
	public void leeMensaje() {
		while (true) {
			try {
				if (buz.getHayMensaje()==true) {
					System.out.println(buz.getMensaje());
					System.out.println("Lo he leido");
					break;
				}else {
					System.out.println("Lector:");
					Thread.sleep(2*1000);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		System.out.println("Lector: empezando");
		leeMensaje();
	}

}
