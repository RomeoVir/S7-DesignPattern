package esercizioinsingleton;

public class AdapterDati extends Info implements DataSource {

	@Override
	public String getSondaCompleta() {

		return getLatitudine() + " " + getLongitudine();
	}

	@Override
	public int getLivello() {
		return 0;
	}


}
