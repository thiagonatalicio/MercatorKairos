package MercatorKairos.src.loops;

import MercatorKairos.src.entidades.Player;
import MercatorKairos.src.entidades.Save;

import java.util.Scanner;

public class NovoJogoLoop extends Loop {
    public NovoJogoLoop(Scanner in) {
        super(in);
    }

    @Override
    public void loop() {
        Save novoSave = new Save();
        Player player = new Player();
        RodarJogoLoop rodarJogoLoop = new RodarJogoLoop(in, novoSave);

        novoSave.setPlayer(player);

        System.out.println("\n[        Novo Jogo        ]");

        System.out.print("Nome do personagem: ");
        player.setNome(in.nextLine());

        System.out.print("Nome do Save: ");
        novoSave.setNome(in.nextLine());

        System.out.println(novoSave.getNome() + " criado com sucesso!\n\n");

        rodarJogoLoop.loop();
    }
}
