package br.com.digitalhouse.objetosjava;

import com.sun.media.sound.AbstractMidiDeviceProvider;
import jdk.nashorn.internal.objects.annotations.Getter;

public class Animal {  /*nome da classe*/

//Atributos públicos

    public String nomeAnimal;
    public String raca;
    public int idade;
    public String cor;

// Encapsulamento   -  Atributos Privados

    private String nomeAnimalPrivado;
    private String racaPrivado;
    private int idadePrivado;
    private String corPrivado;

    private Pessoa donoAnimal;

//Construtor Padrão

    public Animal() {
    }

//Construtor específico

    public Animal(String novoNomeAnimal) {
        nomeAnimal = novoNomeAnimal;
    }

//Metodos

    public void brincar() {
        System.out.println("O Animal esta bricando");
    }

 /*   Métodos Getter and Setters
        Se eu quiser que a pessoa apenas,
        acesse use apenas o Get,
        se eu quiser que modifique o dado use o SET*/

//GETT

    public String getNomeAnimalPrivado(){
        return nomeAnimalPrivado;
    }

    public String getRacaPrivado(){
        return racaPrivado;
    }

    public int getIdadePrivado(){
        return idadePrivado;
    }

    public String getCorPrivado(){
        return corPrivado;
    }

    public Pessoa getDonoAnimal(){
        return donoAnimal;
    }


//SETT

    public void setNomeAnimalPrivado(String novoNomeAnimalPrivado){
        nomeAnimalPrivado=novoNomeAnimalPrivado;
    }

    public void setRacaPrivado(String novaRacaAnimalPrivado){
        racaPrivado=novaRacaAnimalPrivado;
    }

    public void setIdadePrivado(int novaIdadePrivado){
        idadePrivado=novaIdadePrivado;
    }

    public void setCorPrivado(String novaCorPrivado){
        corPrivado=novaCorPrivado;
    }

    public void setDonoAnimal(Pessoa novoDonoAnimal){
        donoAnimal=novoDonoAnimal;
    }

}