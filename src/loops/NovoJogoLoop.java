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
        while (true) {
            System.out.println("Criando Novo Jogo...");
            Save novoSave = new Save();
            novoSave.setPlayer(new Player());
            Player player = novoSave.getPlayer();
            System.out.print("Nome do personagem: ");
            player.setNome(in.nextLine());

            System.out.println(novoSave.getNome() + " criado com sucesso!");
            break;
        }
    }
}
