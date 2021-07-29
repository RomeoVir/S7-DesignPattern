package comunicazione;

public class CanaleHTTP implements CanaleDiComunicazione{

	@Override
	public void inviaNotifica(DataSource ds) {
		System.out.println("ALLARME SCATTATO dalla sonda " + ds.getIdSonda() +
				" chiamata REST ad http://host/alarm?=idsonda=" + ds.getIdSonda() + 
				"&lat=" + ds.getLatitudine() + "&lon=" + ds.getLongitudine() + 
				"&smokelevel=" + ds.getLivelloFumo());
	}

}
