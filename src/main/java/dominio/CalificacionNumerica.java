package dominio;

import java.util.ArrayList;
import java.util.List;

public class CalificacionNumerica implements TipoCalificacion {

	@Override
	public List<String> getCalificacionesValidas() {
		List<String> calificaciones = new ArrayList<>();

		for (Integer i = 1; i <= 10; ++i)
			calificaciones.add(i.toString());
		
		return calificaciones;
	}
}
