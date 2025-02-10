package MercatorKairos.src;

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