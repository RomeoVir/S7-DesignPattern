package creator;

import comunicazione.CanaleDiComunicazione;
import comunicazione.CanaleSMS;

public class CreatorSMS implements CreatorComunicazione{

	@Override
	public CanaleDiComunicazione creaComunicazione() {
		
		CanaleSMS canSMS = new CanaleSMS();
		return canSMS;
	}

}
