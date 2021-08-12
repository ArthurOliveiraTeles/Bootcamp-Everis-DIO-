package poo.model;

public class Endereco {

    public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO} // enum semelhante à uma classe

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;

}
