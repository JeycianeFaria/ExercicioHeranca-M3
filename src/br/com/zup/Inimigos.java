package br.com.zup;

public class Inimigos {

    //atributos
    private String nome;
    private double vida;


    //construtor
    public Inimigos(){

    }

    public Inimigos(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }


    //getters e setters
    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }


    //Método para trocar nome
    public void trocarNome(String nome) {
        this.nome = nome;
    }


    //Método para receber dano
    public void receberDano(double dano){
        double recebeDano = vida - dano;
        vida = recebeDano;
    }


    //Método para exibir vida
    public double exibirVida(){
        return vida;
    }

}
