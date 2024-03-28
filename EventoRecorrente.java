package entities;

import java.time.LocalDate;

public class EventoRecorrente extends Evento {

	public EventoRecorrente(String titulo, String descricao, LocalDate dt_Inicio, LocalDate dt_Fim, String loc) throws DataInvalidaException {
		super(titulo, descricao, dt_Inicio, dt_Fim, loc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String TipoEvento() {
		// TODO Auto-generated method stub
		return "EventoRecorrente";
	}
	
	

}
