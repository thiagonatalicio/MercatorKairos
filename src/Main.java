package MercatorKairos.src;

import MercatorKairos.src.entidades.*;
/*import MercatorKairos.src.loops.CarregarJogoLoop;
import MercatorKairos.src.loops.Loop;
import MercatorKairos.src.loops.NovoJogoLoop;
import MercatorKairos.src.ui.componentes.MenuDeEscolhaPorIndiceNumerico;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
      /*  Scanner in = new Scanner(System.in);
        MenuDeEscolhaPorIndiceNumerico menuPricipal = new MenuDeEscolhaPorIndiceNumerico(in);

        System.out.println("""
                
                
                
                
                
                +-------------------------------+
                |        Mercator Kairós        |
                +-------------------------------+""");

        menuPricipal.add("Novo Jogo", new NovoJogoLoop(in));
        menuPricipal.add("Carregar", new CarregarJogoLoop(in));
        menuPricipal.exibir();

       */
        Cidade cidadeInicial = new Cidade("Afogados da Ingazeira", "Uma cidade meio seca.");
        Player jogador = new Player("Zeca Urubu", cidadeInicial);
        cidadeInicial.setJogador(jogador);
        Item salgado = new Item("Amburguer", "comida", 4f);
        Loja divaTrailer = new Loja("Trailer da diva", "um trailer fora do IF");
        divaTrailer.setFora(cidadeInicial);
        divaTrailer.addItemEstoque(salgado);
        jogador.olharLocar();
        jogador.mudarDeLocal(divaTrailer);
        jogador.olharLocar();
        divaTrailer.venderItem(1);
        jogador.mostrarInventario();
        salgado.descrever();
    }
}