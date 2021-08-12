package poo.model;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 12;

    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    // Encapsulei o setDocumento
    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new RuntimeException("Não pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF) {
            setDocumento(documento, tipo = TipoPessoa.FISICA);
        }
        else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, TipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento inválido para pessoa física ou juridica");
        }

        this.documento = documento;
    }

    private void setDocumento(String documento, TipoPessoa tipo) { // Polimorfismo
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
}
