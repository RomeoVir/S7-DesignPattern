package soluzione;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import packabe_b.Info;
import package_a.DataSource;

public class AdapterDati extends Info implements DataSource {

	@Override
	public String getNomeCompleto() {
		
		return getNome() + " " + getCognome();
	}

	
	@Override
	public int getEta() {
		LocalDate dataNascita = getDataDiNascita().toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate();;
		LocalDate currentDate = LocalDate.now();

		return Period.between(dataNascita, currentDate).getYears();
		
	}

}
