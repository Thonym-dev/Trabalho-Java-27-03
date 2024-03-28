package entities;

import entities.enums.DiaSemana;

import java.time.LocalDate;

public class EventoPeriodico extends Evento {

	private DiaSemana diaSemana;
	public EventoPeriodico(String titulo, String descricao, LocalDate dt_Inicio, LocalDate dt_Fim, String loc,DiaSemana diaSemana) throws DataInvalidaException {
		super(titulo, descricao, dt_Inicio, dt_Fim, loc);
		this.diaSemana = diaSemana;
	
	}
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	@Override
	public String TipoEvento() {
		// TODO Auto-generated method stub
		return "Evento Periodico";
	}
	
	
		// TODO Auto-generated constructor stub
}
