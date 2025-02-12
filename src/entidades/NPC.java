package MercatorKairos.src.entidades;

public class NPC {
    //Atributos.
    private String nome;
    private String cumprimento;
    private String despedida;
    //Métodos especiais.

    public NPC(String nome, String cumprimento, String despedida){
        this.nome = nome;
        this.cumprimento = cumprimento;
        this.despedida = despedida;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCumprimento() {
        return cumprimento;
    }
    public void setCumprimento(String cumprimento) {
        this.cumprimento = cumprimento;
    }

    public String getDespedida() {
        return despedida;
    }
    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }

    //Métodos.
    public void cumprimentar(){
        System.out.println(getCumprimento());
    }

    public void despedir(){
        System.out.println(getDespedida());
    }
}
