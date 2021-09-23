package br.com.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        //testando Heroi
        Heroi heroi1 = new Heroi("Homem-Aranha",100);

        System.out.println(heroi1.getNome());
        heroi1.trocarNome("Spider-Man");
        System.out.println(heroi1.getNome());
        heroi1.receberDano(10);
        System.out.println(heroi1.exibirVida());

        //testando Inimigo
        Inimigos inimigo1 = new Inimigos("Duende-Verde",500);

        System.out.println(inimigo1.getNome());;
        inimigo1.trocarNome("Dr. Octopus ");
        System.out.println(inimigo1.getNome());;
        inimigo1.receberDano(10);
        System.out.println(inimigo1.exibirVida());

        //testando Guerreiro
        Guerreiros guerreiro1 = new Guerreiros("Hércules", 100, 30);

        System.out.println(guerreiro1.getNome());
        guerreiro1.receberDano(guerreiro1.aplicarDano());
        System.out.println(guerreiro1.exibirVida());



        //testanto Magos
        Magos mago1 = new Magos("Sage",100,50);

        System.out.println(mago1.getNome());
        mago1.receberDano(mago1.aplicarMagia());
        System.out.println(mago1.exibirVida());


        //testando Rasteiros
        Rasteiros rasteiro1 = new Rasteiros("Escorpião", 1000, 45);

        System.out.println(rasteiro1.getNome());
        rasteiro1.receberDano(rasteiro1.aplicarDano());
        System.out.println(rasteiro1.exibirVida());


        //testando Voadores
        Voadores voadores1 = new Voadores("Abutre", 500,32);

        System.out.println(voadores1.getNome());
        voadores1.receberDano(voadores1.aplicarDano());
        System.out.println(voadores1.exibirVida());


    }
}
