package MercatorKairos.src.entidades;

public class Lugar {
    //Atributos:
    protected String nome;
    protected String descricao;
    protected Player jogador;
    //Métodos especiais:

    public Lugar(String nome, String descricao){
        setNome(nome);
        setJogador(null);
        setDescricao(descricao);
    }

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
