package MercatorKairos.src.entidades;

public class Construcao extends Lugar{
    //Atributos:
    protected String nomeDoProprietario;
    protected Lugar fora;

    public Construcao(String nome, String descricao) {
        super(nome, descricao);
    }
    //Métodos especiais:

    public Lugar getFora() {
        return fora;
    }

    public void setFora(Lugar fora) {
        this.fora = fora;
    }

    //Métodos:

}
