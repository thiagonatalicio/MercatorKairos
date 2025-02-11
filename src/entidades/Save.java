package MercatorKairos.src.entidades;

import java.time.LocalDateTime;

public class Save {
    private String nome;
    private Player player;
    private Cidades cidadeAtual;
    private final Cidades[] cidades = new Cidades[3];

    public Save() {
        nome = "Mundo " + LocalDateTime.now().toString();
        cidades[0] = new Cidades();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidades[] getCidades() {
        return cidades;
    }

    public Cidades getCidadeAtual() {
        return cidadeAtual;
    }

    public void setCidadeAtual(Cidades cidadeAtual) {
        this.cidadeAtual = cidadeAtual;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
