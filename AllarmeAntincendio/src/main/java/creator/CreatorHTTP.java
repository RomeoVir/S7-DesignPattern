package creator;

import comunicazione.CanaleDiComunicazione;
import comunicazione.CanaleHTTP;

public class CreatorHTTP implements CreatorComunicazione{

	@Override
	public CanaleDiComunicazione creaComunicazione() {
		
		CanaleHTTP canHttp = new CanaleHTTP();
		
		return canHttp;
	}

}
