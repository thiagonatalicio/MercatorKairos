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
        Player jogador = new Player("Nathan" );
        Lugar local = new Loja("Farmacia", "Uma farmácia com muitos remedios e wey");
        Esta esta = new Esta(jogador, local);
        esta.mostrarLugar();
    }
}