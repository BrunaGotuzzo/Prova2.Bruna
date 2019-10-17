package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Aviao extends Personagem implements ArmamentoVip{

    public Aviao () {}

    public Aviao (int id, int pontuacao, boolean abatido) {
        super(id,pontuacao,abatido);
    }

    @Override
        public List<Personagem> gerar(int quant, int size) {
            List<Personagem> avioes = new ArrayList<>();
            int contId = size + 1;
            for (int i=0; i< quant;i++) {
                Aviao av = new Aviao(contId, 50,false );
                avioes.add(av);
                contId++;
            }
            return avioes;
    }



    @Override
    public String toString() {
        return "Aviao {" + "\n" +
                "id=" + id + "\n" +
                "pontuacao=" + pontuacao + "\n" +
                "abatido= " + abatido + "\n" +
                "}";
    }


    @Override
    public int anexar(int quant, String tipo) {
        return 0;
    }
}//Fim do Programa
