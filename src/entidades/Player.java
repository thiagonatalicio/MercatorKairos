package MercatorKairos.src.entidades;

public class Player {
    //Atributos:
    private String nome;
    private Item[] inventario = new Item[10];
    private float dinheiro;
    private Lugar localizacao;
    //Métodos especiais:

    public Player(String nome, Lugar localizacao) {
        setNome(nome);
        setDinheiro(10f);
        setLocalizacao(localizacao);
    }

    public Lugar getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Lugar localizacao) {
        this.localizacao = localizacao;
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

    public void mudarDeLocal(Lugar local){
        Player temporario = this.localizacao.getJogador();
        this.localizacao.setJogador(null);
        setLocalizacao(local);
        this.localizacao.setJogador(temporario);
        System.out.println(this.nome +" foi para " + this.localizacao.getNome());
    }

    public void olharLocar(){
        System.out.println("Descrição do local: " + this.localizacao.getDescricao());
    }
}
