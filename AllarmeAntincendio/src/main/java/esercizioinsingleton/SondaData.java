package esercizioinsingleton;


public class SondaData {
	private String nomeCompleto;
	private int livello;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getSondaCompleta();
		livello = ds.getLivello();
	}
	
	public void stampa() {
		System.out.println("Coordinare : " + nomeCompleto + "Livello : " + livello);
	}
}
