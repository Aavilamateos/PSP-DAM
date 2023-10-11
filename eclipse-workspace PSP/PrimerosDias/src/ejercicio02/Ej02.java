package ejercicio02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ej02 {
	
	public static void main(String[] args) {
		try {
			Process p=Runtime.getRuntime().exec("cmd /c dir");
			InputStream iS=p.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(iS));
			String linea;
			while ((linea=reader.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
		e.printStackTrace();
		}
		
	}
	
	
}
