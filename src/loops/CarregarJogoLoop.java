/* package MercatorKairos.src.loops;

import MercatorKairos.src.entidades.Player;
import MercatorKairos.src.entidades.Save;

import java.util.Scanner;

public class CarregarJogoLoop extends Loop {
    public CarregarJogoLoop(Scanner in) {
        super(in);
    }

    @Override
    public void loop() {
        Save saveCarregado = new Save();
        Player player = new Player();
        RodarJogoLoop rodarJogoLoop = new RodarJogoLoop(in, saveCarregado);

        saveCarregado.setPlayer(player);

        System.out.println("[        Carregando Jogo (Não Implementado!)        ]");
        player.setNome("Steve Jobs");

        saveCarregado.setNome("Save do Ós");
        System.out.println("  " + saveCarregado.getNome() + " carregado com sucesso!\n\n");

        rodarJogoLoop.loop();
    }
}

 */