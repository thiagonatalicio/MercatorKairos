package MercatorKairos.src;

import MercatorKairos.src.loops.Loop;
import MercatorKairos.src.loops.NovoJogoLoop;
import MercatorKairos.src.ui.componentes.MenuDeEscolhaPorIndiceNumerico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Scanner in = new Scanner(System.in);
        MenuDeEscolhaPorIndiceNumerico menuPricipal = new MenuDeEscolhaPorIndiceNumerico(in);

        System.out.println("""
                +-------------------------------+
                |        Mercator Kairós        |
                +-------------------------------+""");

        menuPricipal.add("Novo Jogo", new NovoJogoLoop(in));
        menuPricipal.add("Carregar", new Loop(in));
        menuPricipal.exibir();
    }
}