package br.com.zup;

public class Rasteiros extends Inimigos {

    //atributos
    private double danoEspinhos;


    //construtor
    public Rasteiros(){

    }

    public Rasteiros(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }


    //getters e setters

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }


    //Método para aplicar Dano
    public double aplicarDano(){
        return danoEspinhos;
    }

}
