package MercatorKairos.src.entidades;
import java.util.Scanner;
public class Loja extends Construcao{
    //Atributos:
    private NPC atendente;
    private String tipo;
    private Item[] estoque = new Item[50];
    private Player jogador;
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
    public void mostrarItensAVenda(){
        int i = 0;
        while(this.estoque[i] != null){
            System.out.println(this.estoque[i].getNome());
            i++;
        }
    }

    public void venderItem(){
        
    }
}
