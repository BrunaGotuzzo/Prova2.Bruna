package model;



import java.util.ArrayList;
import java.util.List;

public class Navio extends Personagem implements ArmamentoVip{

    public Navio () {}

    public Navio(int id, int pontuacao, boolean abatido) {
        super(id,pontuacao,abatido);
    }

    @Override
    public List<Personagem> gerar(int quant, int size) {
        List<Personagem> navios = new ArrayList<>();
        int contId = size + 1;
        for (int i=0; i< quant;i++) {
            Navio av = new Navio(contId, 100,false );
            navios.add(av);
            contId++;
        }
        return navios;
    }



    @Override
    public String toString() {
        return "Navio {" + "\n" +
                "id=" + id + "\n" +
                "pontuacao=" + pontuacao + "\n" +
                "abatido= " + abatido + "\n" +
                "}";
    }



    @Override
    public int anexar(int quant, String tipo) {
        return 0;
    }
}
