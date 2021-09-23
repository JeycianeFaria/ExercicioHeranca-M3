package br.com.zup;

public class Guerreiros extends Heroi{

    //atributos
    public double poderAtaque;


    //construtor
    public Guerreiros(){

    }

    public Guerreiros(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderAtaque = poderMagico;
    }


    //getters e setters

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }


    //Método para aplicar Magia
    public double aplicarDano(){
        return aplicarDano();
    }
}
