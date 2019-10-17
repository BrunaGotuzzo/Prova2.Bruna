package model;

import java.util.List;

public class Tanque extends Personagem {



    public Tanque () {}

    public Tanque (int id, int pontuacao, boolean abatido) {
        super(id,pontuacao,abatido);
    }

    @Override
    public List<Personagem> gerar(int quant, int size) {
        return null;
    }



    @Override
    public String toString() {
        return "Tanque {" + "\n" +
                "id=" + id + "\n" +
                "pontuacao=" + pontuacao + "\n" +
                "abatido= " + abatido + "\n" +
                "}";
    }
}
