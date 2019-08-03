package br.com.digitalhouse.objetosjava;

public class Pessoa {
    private String nomePessoa;

    public Pessoa(String novoNome){
        nomePessoa=novoNome;
    }

    public String getNomePessoa(){
        return nomePessoa;
    }

    public void setNomePessoa(String novoNomePessoa){
        nomePessoa=novoNomePessoa;

    }

}
