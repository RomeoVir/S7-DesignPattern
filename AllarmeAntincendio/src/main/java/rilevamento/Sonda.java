package rilevamento;

import java.util.ArrayList;
import java.util.List;

import observer.Osservato;
import observer.Osservatore;
import comunicazione.DataSource;

public class Sonda implements Osservato {
	private String longitudine;
	private String latitudine;
	private int livelloFumo;
	private int idSonda;

	private DataSource ds = new DataSource();
	private List<Osservatore> listaControllori = new ArrayList<>();

	public Sonda(int idSonda, String longitudine, String latitudine) {
		this.longitudine = longitudine;
		this.latitudine = latitudine;
		this.idSonda = idSonda;
	}

	public void aggiungiOsservatore(Osservatore o) {
		listaControllori.add(o);
	}

	public void eliminaOsservatore(Osservatore o) {
		listaControllori.remove(o);
	}

	public void leggiDati() {
		ds.setLatitudine(this.latitudine);
		ds.setLongitudine(this.latitudine);
		ds.setLivelloFumo(this.livelloFumo);
		ds.setIdSonda(this.idSonda);

	}

	public void notificaOsservatore() {
		leggiDati();
		for (Osservatore o : listaControllori) {
			o.riceviSegnale(ds);
		}
	}

	public int getIdSonda() {
		return idSonda;
	}

	public void setIdSonda(int idSonda) {
		this.idSonda = idSonda;
	}

	public String getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}

	public String getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}

	public int getLivelloFumo() {
		return livelloFumo;
	}

	public void setLivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
	}

	public List<Osservatore> getListaControllori() {
		return listaControllori;
	}

	public void setListaControllori(List<Osservatore> listaControllori) {
		this.listaControllori = listaControllori;
	}
}
