package br.com.zup;

public class Magos extends Heroi {

    //atributos
    public double poderMagico;


    //construtor
    public Magos(){

    }

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }


    //getters e setters
    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }


    //Método para aplicar Magia
    public double aplicarMagia(){
        return poderMagico;
    }

}
