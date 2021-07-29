package rilevamento;

import comunicazione.DataSource;
import creator.CreatorHTTP;
import creator.CreatorSMS;
import observer.Osservatore;

public class CentroControllo implements Osservatore{
	
	private CreatorHTTP ComunicaHttp = new CreatorHTTP();
	private CreatorSMS ComunicaSMS = new CreatorSMS();

	@Override
	public void riceviSegnale(DataSource ds) {
		
		if(ds.getLivelloFumo()>=5 && ds.getLivelloFumo()<10) {
			ComunicaHttp.creaComunicazione().inviaNotifica(ds);
			ComunicaSMS.creaComunicazione().inviaNotifica(ds);
		}else if (ds.getLivelloFumo()<0 || ds.getLivelloFumo()>10){
			System.out.println("Livello errato, sonda " + ds.getIdSonda() + " difettosa. Livello " + ds.getLivelloFumo());
		}else if (ds.getLivelloFumo()>=0 && ds.getLivelloFumo()<5){
			System.out.println("Livello sonda " + ds.getIdSonda() + ". Nessuna anomalia.");
		}
		
	}

}
