package br.com.zup;

public class Guerreiros extends Heroi{

    //atributos
    private double poderAtaque;


    //construtor
    public Guerreiros(){

    }

    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }


    //getters e setters
    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }


    //Método para aplicar Dano
    public double aplicarDano(){
        return poderAtaque;
    }
}
