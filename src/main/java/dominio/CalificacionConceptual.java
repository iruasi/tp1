package dominio;

import java.util.ArrayList;
import java.util.List;

public class CalificacionConceptual implements TipoCalificacion {

	enum calificacionesValidas {
		M, R, B, MB;
	}

	@Override
	public List<String> getCalificacionesValidas() {
		List<String> calificaciones = new ArrayList<>();

		for (calificacionesValidas calif : calificacionesValidas.values())
			calificaciones.add(calif.toString());

			return calificaciones;
	}
}
