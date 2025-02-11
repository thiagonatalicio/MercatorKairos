package MercatorKairos.src;

import MercatorKairos.src.entidades.Player;
import MercatorKairos.src.entidades.Save;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        label:
        while (true) {
            System.out.print("""
                    1) Novo Jogo
                    2) Carregar
                    3) Sair
                    =>\s""");
            String opt = in.nextLine();

            switch (opt) {
                case "3":
                    System.out.println("Saindo...");
                    break label;
                case "1":
                    System.out.println("Criando Novo Jogo...");
                    Save novoSave = new Save();
                    novoSave.setPlayer(new Player());
                    Player player = novoSave.getPlayer();
                    System.out.print("Nome do personagem: ");
                    player.setNome(in.nextLine());

                    System.out.println(novoSave.getNome() + " criado com sucesso!");
                    break;
                case "2":
                    System.out.println("Escolha:");
                    break;
                default:
                    System.out.println("Comando desconhecido");
                    break;
            }
        }
    }
}