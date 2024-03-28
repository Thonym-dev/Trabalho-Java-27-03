package entities;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws DataInvalidaException {
      
    	try {
    		Pessoa pessoa1 = new Pessoa("João", "123456");
        Pessoa pessoa2 = new Pessoa("Maria", "789012");

        Evento evento = new EventoUnico("Evento de Teste", "Descrição qualquer", LocalDate.of(2024, 6, 1), LocalDate.of(2024, 5, 1) , "Local de Teste");
        evento.adicionarParticipante(pessoa1);
        evento.adicionarParticipante(pessoa2);

        System.out.println("Detalhes do Evento:");
        System.out.println(evento);

        System.out.println("\nParticipantes do Evento:");
        for (Pessoa participante : evento.getParticipantes()) {
            System.out.println(participante);
        }

        evento.removerParticipante(pessoa1);

        System.out.println("\nParticipantes do Evento após remoção:");
        for (Pessoa participante : evento.getParticipantes()) {
            System.out.println(participante);
        }
    	}
    	catch (DataInvalidaException e) {
    		
    		System.out.println(e);
    	}
    	
    }
    
}
