package MercatorKairos.src.entidades;

public abstract class Construcao extends Lugar{
    //Atributos:
    protected String nomeDoProprietario;
    protected Lugar fora;
    protected Item[] estoque = new Item[50];

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

    public Item[] setEstoque() {
        return estoque;
    }

    public void setEstoque(Item[] estoque) {
        this.estoque = estoque;
    }
    //Métodos:
    public void mostrarOpcoes() {

    }

    public void addItemEstoque(Item item){
        int i = 0;
        while (estoque[i] != null && i < 50){
            i++;
        }
        if (i < 50){
            this.estoque[i] = item;
        } else {
            System.out.println("item não add a estoque: " + this.nome);
        }
    }

}
