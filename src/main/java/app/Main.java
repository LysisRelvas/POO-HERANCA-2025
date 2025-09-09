package app;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main (String [] args) {
        // Tarefa[] tarefas = new Tarefa[5];

        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas [4] = new Tarefa(4, "Novo Teste", false);

        // System.out.println(tarefas[0].getDescricao());
    
        PessoaFisica pf = new PessoaFisica(
            "Lysis",
            "Rua No Existe, 0",
            LocalDate.of(2002, Month.OCTOBER,23),
            "544.558.361-12");
        
        System.out.println("Peesoa Física criada com sucesso!");
        System.out.println(pf.exibirInformacoes());

        System.out.println("\n\n---Criando Pessoa Jurídica ---");

        PessoaJuridica pj = new PessoaJuridica(
            "New Analise LTDA",
            "Rua Zero, 1620",
            LocalDate.of(2025, Month.SEPTEMBER,22),
            "Nome fantasia " ,
            "11.162.016/0001-20");

        System.out.println(pj.exibirInformacoes());




    
    
    }
}