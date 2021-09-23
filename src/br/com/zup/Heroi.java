package br.com.zup;

public class Heroi {

    //atributos
    private String nome;
    private double vida;


    //construtor
    public Heroi(){

    }

    public Heroi(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }


    //getters e setters
    public String getNome() {
        return nome;
    }


    public void setVida(double vida) {
        this.vida = vida;
    }


    //Método para trocar de nome
    public void trocarNome(String nome){
        this.nome = nome;
    }


    //Método para receber Dano
    public  void receberDano(double dano){
        double recebeDano = vida - dano;
        vida = recebeDano;
    }


    //Método para exibir vida
    public double exibirVida(){
        return vida;
    }

}
