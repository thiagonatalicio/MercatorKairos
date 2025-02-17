package MercatorKairos.src.entidades;

public class Player {
    //Atributos:
    private String nome;
    private Item[] inventario = new Item[10];
    private float dinheiro;
    //Métodos especiais:

    public Player(String nome) {
        setNome(nome);
        setDinheiro(10f);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Item getInventario(int i) {
        return this.inventario[i];
    }

    public void setInventario(int i, Item item) {
        this.inventario[1] = item;
    }

    //Métodos:
    public void mostrarInventario(){
        System.out.println("========================");
        System.out.println("      <Iventario>");
        System.out.println("========================");

        for(int i = 0; i < 10; i++){
            if(inventario[i] != null){
                System.out.println("- " + inventario[i].getNome());
            }

        }
        System.out.println("========================");
    }

    public void adquirirItem(Item item){
        int i = 0;
        while(this.inventario[i] != null){
            i++;
        }
        this.inventario[i] = item;
    }

    public void removerItem(int i){
        this.inventario[i + 1] = null;
    }

}
