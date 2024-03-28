package entities;

import java.time.LocalDate;
import java.util.Objects;

import java.util.HashSet;
import java.util.Set;


public abstract class Evento{
	protected String titulo;
	protected String descricao;
	protected LocalDate dt_Inicio;
	protected LocalDate dt_Fim;
	protected String loc;
	private Set<Pessoa> participantes;
	
	public Evento(String titulo, String descricao, LocalDate dt_Inicio, LocalDate dt_Fim, String loc) throws DataInvalidaException {
		super();
		if(dt_Inicio.isAfter(dt_Fim)) {
			throw new DataInvalidaException("Esse aqui é o exception Data invalida");
		}
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.dt_Inicio = dt_Inicio;
		this.dt_Fim = dt_Fim;
		this.loc = loc;
		this.participantes = new HashSet<>();
		
	}

	public abstract String TipoEvento();
	
	
	@Override
	public String toString() {
		return "Evento [titulo=" + titulo + ", descricao=" + descricao + ", dt_Inicio=" + dt_Inicio + ", dt_Fim="
				+ dt_Fim + ", loc=" + loc + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(LocalDate dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public LocalDate getDt_Fim() {
		return dt_Fim;
	}

	public void setDt_Fim(LocalDate dt_Fim) {
		this.dt_Fim = dt_Fim;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, dt_Fim, dt_Inicio, loc, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(dt_Fim, other.dt_Fim)
				&& Objects.equals(dt_Inicio, other.dt_Inicio) && Objects.equals(loc, other.loc)
				&& Objects.equals(titulo, other.titulo);
	}

	public Set<Pessoa> getParticipantes() {
		return participantes;
	}

	
	
	public boolean adicionarParticipante(Pessoa pessoa) {
		
		if (pessoa != null) {
			participantes.add(pessoa);
			return true;
		} else {
			return false;
		}
	}
		
	public boolean removerParticipante(Pessoa pessoa) {
		
		if (participantes.contains(pessoa) && pessoa != null) {
			participantes.remove(pessoa);
			return true;
		} else {
			return false;
			
		}	
	}
	
	
}
