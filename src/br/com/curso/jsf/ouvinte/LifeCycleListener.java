package br.com.curso.jsf.ouvinte;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCycleListener implements PhaseListener {
	
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("FIM DA FASE " + arg0.getPhaseId());
		
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("INICIO DA FASE " + arg0.getPhaseId());
		
	}

}
