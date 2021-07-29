package observer;

import comunicazione.DataSource;

public interface Osservatore {
	
	void riceviSegnale(DataSource ds);
	
}
