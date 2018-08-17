package ui.view;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewmodel.NotasViewModel;

public class LectorDeNotasView extends SimpleWindow<NotasViewModel>{

	public LectorDeNotasView(WindowOwner parent) {
		super(parent, new NotasViewModel());
	}

	@Override
	protected void addActions(Panel arg0) {
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Lector de Notas");
		
		
		Panel form = new Panel(mainPanel);
	}

}
