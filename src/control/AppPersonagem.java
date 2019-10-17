package control;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppPersonagem   {

    static int cont = 0;

    public static void main(String[] args) {

        //Questão 1//

        //A)

  //Tanque
        Tanque tan1 = new Tanque(1, 10,  false);
        Tanque tan2= new Tanque(2, 10,  false);
        Tanque tan3 = new Tanque(3, 10, false);

///////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

  //Navio
        Navio nav1= new Navio(4, 100, false);
        Navio nav2= new Navio(5, 100, false);
        Navio nav3= new Navio(6, 100, false);
//////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
  //Aviao
        Aviao av1 = new Aviao(7, 50, false);
        Aviao av2 = new Aviao(8, 50, false);
        Aviao av3 = new Aviao(9, 50, false);
//////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////

 //B)
        List<Personagem> personagens=new ArrayList<>();
        personagens.add(tan1);
        personagens.add(tan2);
        personagens.add(tan3);
        personagens.add(nav1);
        personagens.add(nav2);
        personagens.add(nav3);
        personagens.add(av1);
        personagens.add(av2);
        personagens.add(av3);


        System.out.println(personagens);

  //C) Criar Mais 3 Instancias de Navio e Aviao, depois imprimi-los//


   Aviao av = new Aviao();
   List<Personagem> tamp1 = av.gerar(3 ,personagens.size());
        personagens.addAll(tamp1);



        Navio nav = new Navio();
        List<Personagem> tamp2 = nav.gerar(3 ,personagens.size());
        personagens.addAll(tamp2);
        System.out.println(personagens);

  ///////////////////////////////////////////////////////////////////////////////////////
  //D)
        tamp1.forEach((i) -> {
            i.abater(true);


            cont += i.getPontuacao();
        });
        System.out.println(cont);



   //E)
        personagens.forEach((i) ->{
            if (i instanceof ArmamentoVip && i.getAbatido()==false) {
              i.setPontuacao(i.getPontuacao()*2);
              cont += (i.getPontuacao() * 2);
            }
        });

        System.out.println(cont);

//F)

        personagens.forEach((i) ->{
            if ((i instanceof Navio || i instanceof Aviao) && i.getAbatido()==false) {
                i.abater(true);
                cont += i.getPontuacao();
            }
            });
            System.out.println(cont);



        //G) Listar em Ordem Decrescente

 personagens.sort(Comparator.comparingInt(Personagem::getPontuacao ).reversed());
        System.out.println(personagens);


//H) Personagens Abatidos
        personagens.forEach((i) ->{
            if (i.getAbatido()==true) {
                System.out.println(i);
            }
        });


 //I)
        personagens.forEach((i) ->{
            if (i instanceof Aviao  ) {
                System.out.println(i);
            }
        });



//J)
        personagens.forEach((i) ->{
            if (i instanceof ArmamentoVip  ) {
                System.out.println(i);
            }
        });

    }


} //Fim do Programa
