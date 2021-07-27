package esercizio1;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import esercizio1.package_a.UserData;
import esercizio1.package_b.Info;
import esercizio1.soluzione.AdapterDati;

public class Start {
	public static void main(String[] args) {
		
		Calendar calendar = new GregorianCalendar(2013,1,28,0,0,0);
		Date nascita = calendar.getTime();
		
		Info info = new Info();
		info.setNome("ROmeo");
		info.setCognome("Virgilio");
		info.setDataDiNascita(nascita);
		
		UserData userData = new UserData();
		
		//userData.getData(info);
		
		AdapterDati info2 = new AdapterDati();
		info2.setNome(info.getNome());
		info2.setCognome(info.getCognome());
		info2.setDataDiNascita(info.getDataDiNascita());
		
		userData.getData(info2);
		
		userData.stampa();
	}

}
