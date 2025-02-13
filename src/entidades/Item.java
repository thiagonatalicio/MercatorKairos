package MercatorKairos.src.entidades;

public class Item {
    //Atributos:
    private String nome;
    private String tipo;
    private float preco;
    //Métodos especiais:

    public Item(String nome, String tipo, float preco){
        setNome(nome);
        setTipo(tipo);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco > 0){
            this.preco = preco;
        }
        System.out.println("Erro, o preço não pode ser negativo!");
        this.preco = 999999999999999999999999f;
    }
    //Métodos:

}
