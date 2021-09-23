package br.com.zup;

public class Voadores extends Inimigos{

    //atributos
    private double danoTiro;


    //construtor
    public Voadores(){

    }

    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }


    //getters e setters

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }


    //Método para aplicar Dano
    public double aplicarDano(){
        return danoTiro;
    }

}
