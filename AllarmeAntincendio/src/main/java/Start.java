import java.util.Scanner;

import rilevamento.CentroControllo;
import rilevamento.Sonda;

public class Start {
	public static void main(String[] args) {
		
		Sonda s1 = new Sonda(1, "12345", "54321");
		Sonda s2 = new Sonda(2, "12346", "54322");
		Sonda s3 = new Sonda(3, "12343", "54323");
		Sonda s4 = new Sonda(4, "12348", "54325");
		CentroControllo Milano = new CentroControllo();
		
		/*	Input console:
		 * 	Sonda < 0 		ERRORE
		 * 	Sonda > 10 		ERRORE
		 *  0 > Sonda > 5 	OK
		 *  5 > Sonda > 10 	INCENDIO
		 */
		Scanner scanner = new Scanner (System.in);
		System.out.println("Inserire il livello di fumo della sonda "+ s1.getIdSonda() + ":");
		int livelloSonda = scanner.nextInt();
		System.out.println("Inserire il livello di fumo della sonda "+ s2.getIdSonda() + ":");
		int livelloSonda2 = scanner.nextInt();
		System.out.println("Inserire il livello di fumo della sonda "+ s3.getIdSonda() + ":");
		int livelloSonda3 = scanner.nextInt();
		System.out.println("Inserire il livello di fumo della sonda "+ s4.getIdSonda() + ":");
		int livelloSonda4 = scanner.nextInt();
		scanner.close();
		
		
		s1.aggiungiOsservatore(Milano);
		s2.aggiungiOsservatore(Milano);
		s3.aggiungiOsservatore(Milano);
		s4.aggiungiOsservatore(Milano);
		
		s1.setLivelloFumo(livelloSonda);
		s2.setLivelloFumo(livelloSonda2);
		s3.setLivelloFumo(livelloSonda3);
		s4.setLivelloFumo(livelloSonda4);

		s1.notificaOsservatore();
		s2.notificaOsservatore();
		s3.notificaOsservatore();
		s4.notificaOsservatore();	
		
		
		//s3.setLivelloFumo(7);		
	}

}