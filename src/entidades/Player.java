package MercatorKairos.src.entidades;

public class Player {
    //Atributos.
    private String nome;
    private int vida;
    private int forca;
    private int velocidade;
    private Item[] inventario = new Item[10];
    private float dinheiro;
    //Métodos especiais.

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
