package observer;

public interface Osservato {
	void aggiungiOsservatore(Osservatore o);
	void eliminaOsservatore(Osservatore o);
	void notificaOsservatore();

}
