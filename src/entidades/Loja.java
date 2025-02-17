package MercatorKairos.src.entidades;

public class Loja extends Construcao{
    //Atributos:
    private NPC atendente;
    private String tipo;


    public Loja(String nome, String descricao) {
        super(nome, descricao);
    }
    //Métodos especiais:

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Item[] getEstoque() {
        return estoque;
    }

    public void setEstoque(Item[] estoque) {
        this.estoque = estoque;
    }

    //Métodos:
    @Override
    public void mostrarOpecoes(){
        System.out.println("1) Sair da loja");
        System.out.println("2) Comprar");
        System.out.println("3) Vender");
    }

    public void mostrarItensAVenda(){
        int i = 0;
        while(this.estoque[i] != null){
            System.out.println(this.estoque[i].getNome());
            i++;
        }
    }

    public void venderItem(int indice){
        if(indice > 0){
            indice--;
            int i = 0;
            while (jogador.getInventario(i) != null && i < 10){
                i++;
            }
            if(i < 10){
                jogador.setInventario(i, this.estoque[i]);
            }
        }
    }
}
