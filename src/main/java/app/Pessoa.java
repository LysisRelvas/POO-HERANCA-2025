package app;

import java.time.LocalDate

public abstract Pessoa {

    protected String nome;
    protected String endereço;
    protected LocalDate dataCriacao;

    public String getNome() {
        return nome;
    }
       

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String Endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        thisdataCriacao;
    }

    public abstract String exibirInformacoes() {
        return "Nome: " + this.nome + "\n" +
                "Endereço: " +this.endereco + "\n" +
                "Data de Cadastro: " + this.dataCriacao;
    }

}