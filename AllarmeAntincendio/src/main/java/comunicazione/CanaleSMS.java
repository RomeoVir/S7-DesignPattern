package comunicazione;

public class CanaleSMS implements CanaleDiComunicazione{
	
	@Override
	public void inviaNotifica(DataSource ds) {
		System.out.println("ALLARME SCATTATO dalla sonda " + ds.getIdSonda() + " Invio sms a tutti i dipendenti. Livello " + ds.getLivelloFumo());
	}
}
