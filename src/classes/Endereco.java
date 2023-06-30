package classes;

public class Endereco {
    private String rua;
    private String cidade;
    private String cep;
    private int numero;

    public Endereco(String rua, String cidade, String cep, int numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

}
