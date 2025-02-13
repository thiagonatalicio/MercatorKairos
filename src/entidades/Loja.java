package MercatorKairos.src.entidades;
import java.util.Scanner;
public class Loja extends Construcao{
    //Atributos:
    private NPC atendente;
    private String tipo;
    private Item[] estoque = new Item[50];

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

    public void addItemEstoque(Item item){
        int i = 0;
        while (estoque[i] != null && i < 50){
            i++;
        }
        if (i < 50){
            this.estoque[i] = item;
        } else {
            System.out.println("item não add a loja: " + this.nome);
        }

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
