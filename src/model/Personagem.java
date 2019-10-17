package model;

import java.awt.*;
import java.util.List;

public abstract class Personagem  {
    protected int id;
    protected int pontuacao;
    protected boolean abatido;

    public Personagem() {}

    public Personagem(int id, int pontuacao, boolean abatido) {
        this.id=id;
        this.pontuacao=pontuacao;
        this.abatido=abatido;
    }

    public abstract List<Personagem> gerar(int quant, int size );


    public void abater(boolean abater) {
        this.abatido = abater;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean getAbatido() {
        return abatido;
    }

    public void setAbatido(boolean abatido) {
        this.abatido = abatido;
    }


    @Override
    public String toString() {
        return "Personagem {" + "\n" +
                "id=" + id + "\n" +
                "pontuacao=" + pontuacao + "\n" +
                "abatido= " + abatido + "\n" +

                "}";
    }



} //Fim do Programa
