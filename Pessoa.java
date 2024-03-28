package entities;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private String matricula;
	
	
	public Pessoa(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(matricula, other.matricula) && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
}
