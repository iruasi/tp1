package aplicacion;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import ui.view.LectorDeNotasView;

public class LectorDeNotasAplicacion extends Application {

	public static void main(String[] args) {
		new LectorDeNotasAplicacion().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		return new LectorDeNotasView(this);
	}
}
