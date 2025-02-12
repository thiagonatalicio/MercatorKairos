package MercatorKairos.src.entidades;

public class Lugar {
    //Atributos:
    private String nome;
    private String descricao;
    private Player jogador;
    //Métodos especiais:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Player getJogador() {
        return jogador;
    }

    public void setJogador(Player jogador) {
        this.jogador = jogador;
    }

    //Métodos:
    public void descreverLugar(){
        System.out.println(getDescricao());
    }
}
