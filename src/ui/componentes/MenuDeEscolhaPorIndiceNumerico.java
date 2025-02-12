package MercatorKairos.src.ui.componentes;

import MercatorKairos.src.loops.Loop;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDeEscolhaPorIndiceNumerico {
    private ArrayList<String> rotulos;
    private ArrayList<Loop> loops;
    private final Scanner in;
    private String exitCommand = "s";
    private String exitMesseger = "Sair";
    private int tempoDeEspera = 1500;


    public MenuDeEscolhaPorIndiceNumerico(Scanner in) {
        this.in = in;
        rotulos = new ArrayList<>();
        loops = new ArrayList<>();
    }

    public void exibir() {
        while (true) {
            int i = 1;

            for(String rotulo : rotulos) {
                System.out.println(i + ") " + rotulo);
                i++;
            }

            System.out.println(exitCommand + ") " + exitMesseger);

            System.out.print("=> ");
            String opt = in.nextLine();

            if(opt.equalsIgnoreCase(exitCommand)) {
                break;
            }

            else if(isInt(opt)) {
                try {
                    loops.get(getIndex(opt)).loop();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Comando Inválido");
                    esperar(tempoDeEspera);
                }
            } else {
                System.out.println("Comando inválido!");
                esperar(tempoDeEspera);
            }
        }
    }

    private boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int getIndex(String str) {
        return Integer.parseInt(str) - 1;
    }

    private void esperar(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(String rotulo, Loop loop) {
        rotulos.add(rotulo);
        loops.add(loop);
    }

    public String getExitCommand() {
        return exitCommand;
    }

    public void setExitCommand(String exitCommand) {
        this.exitCommand = exitCommand;
    }

    public String getExitMesseger() {
        return exitMesseger;
    }

    public void setExitMesseger(String exitMesseger) {
        this.exitMesseger = exitMesseger;
    }

    public int getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(int tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }
}
