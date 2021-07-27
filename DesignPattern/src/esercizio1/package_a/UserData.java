package esercizio1.package_a;


public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}
	public void stampa() {
		System.out.println("Nome completo : " + nomeCompleto + "Di anni : " + eta);
	}
}
