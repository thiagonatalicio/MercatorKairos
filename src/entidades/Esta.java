package MercatorKairos.src.entidades;

public class Esta {
    private Player jogador;
    private Lugar local;

    public Esta(Player jogador, Lugar local) {
        setJogador(jogador);
        setLocal(local);
    }

    public Player getJogador() {
        return jogador;
    }

    public void setJogador(Player jogador) {
        this.jogador = jogador;
    }

    public Lugar getLocal() {
        return local;
    }

    public void setLocal(Lugar local) {
        this.local = local;
    }

    public void mostrarLugar(){
        System.out.println("Nome do lugar: " + local.getNome());
        System.out.println("Descrição do lugar: " + this.local.getDescricao());
    }

    public void mudarDeLocal(Lugar local){
        Player temporario = this.local.getJogador();
        this.local.setJogador(null);
        setLocal(local);
        this.local.setJogador(temporario);
        System.out.println(this.jogador.getNome()+" foi para " + this.local.getNome());
    }
}
